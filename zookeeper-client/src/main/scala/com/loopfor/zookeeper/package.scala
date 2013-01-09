/*
 * Copyright 2013 David Edwards
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.loopfor

import java.net.InetSocketAddress
import org.apache.zookeeper.KeeperException
import scala.language._

/**
 * @todo package documentation goes here along with examples
 */
package object zookeeper {
  type KeeperException = org.apache.zookeeper.KeeperException
  type APIErrorException = KeeperException.APIErrorException
  type AuthFailedException = KeeperException.AuthFailedException
  type BadArgumentsException = KeeperException.BadArgumentsException
  type BadVersionException = KeeperException.BadVersionException
  type ConnectionLossException = KeeperException.ConnectionLossException
  type DataInconsistencyException = KeeperException.DataInconsistencyException
  type InvalidACLException = KeeperException.InvalidACLException
  type InvalidCallbackException = KeeperException.InvalidCallbackException
  type MarshallingErrorException = KeeperException.MarshallingErrorException
  type NoAuthException = KeeperException.NoAuthException
  type NoChildrenForEphemeralsException = KeeperException.NoChildrenForEphemeralsException
  type NodeExistsException = KeeperException.NodeExistsException
  type NoNodeException = KeeperException.NoNodeException
  type NotEmptyException = KeeperException.NotEmptyException
  type NotReadOnlyException = KeeperException.NotReadOnlyException
  type OperationTimeoutException = KeeperException.OperationTimeoutException
  type RuntimeInconsistencyException = KeeperException.RuntimeInconsistencyException
  type SessionExpiredException = KeeperException.SessionExpiredException
  type SessionMovedException = KeeperException.SessionMovedException
  type SystemErrorException = KeeperException.SystemErrorException
  type UnimplementedException = KeeperException.UnimplementedException

  implicit def tupleToInetSocketAddress(addr: (String, Int)): InetSocketAddress =
    new InetSocketAddress(addr._1, addr._2)
}
