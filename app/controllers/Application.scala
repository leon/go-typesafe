package controllers

import play.api.mvc.{Action, Controller}

object Application extends Controller {
  def index = Action {Ok(views.html.index("Hello Play Framework"))}
  def scalabilityShowOff = Action {Ok(views.html.scalability.showOff("Scalability Show Off"))}
  def scalabilityGetProof = Action {Ok(views.html.scalability.getProof("Scalability Get Proof"))}
  def productivityShowOff = Action {Ok(views.html.productivity.showOff("Productivity Show Off"))}
  def productivityGetProof = Action {Ok(views.html.productivity.getProof("Productivity Get Proof"))}
  def modernizeShowOff = Action {Ok(views.html.modernize.showOff("Modernize Show Off"))}
  def modernizeGetProof = Action {Ok(views.html.modernize.getProof("Modernize Get Proof"))}
  def agilityQualityShowOff = Action {Ok(views.html.agilityQuality.showOff("Agility & Quality Show Off"))}
  def agilityQualityGetProof = Action {Ok(views.html.agilityQuality.getProof("Agility & Quality Get Proof"))}
  
  def convince = Action {Ok(views.html.convince("Convince"))}
}