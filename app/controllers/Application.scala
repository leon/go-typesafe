package controllers

import play.api.mvc.{Action, Controller}

object Application extends Controller {
  def index = Action {Ok(views.html.index("Hello Play Framework"))}
  def scalabilityShowOff = Action {Ok(views.html.scalability.showOff("Scalability Show Off"))}
  def scalabilityGetProof = Action {Ok(views.html.scalability.getProof("Scalability Get Proof"))}
  def scalabilityConvince = Action {Ok(views.html.scalability.convince("Scalability Convince"))}
}