/*
 * Copyright (c) 2011 Denis Bardadym
 * Distributed under Apache License.
 */

package code.snippet

import net.liftweb._
import bootstrap.liftweb.UserPage
import util.Helpers._

/**
 * User: denis.bardadym
 * Date: 9/19/11
 * Time: 2:16 PM
 */

class UserOps(up: UserPage) {

    def render =
    "*" #> <b>This is { up.login }</b>

}