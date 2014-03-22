package controllers

import play.api.mvc.{Action, Controller}

object Application extends Controller {
  def index = Action {implicit request => Ok(views.html.index("Go Typesafe"))}
  def scalabilityShowOff = Action {implicit request => Ok(views.html.scalability.showOff("Scalability Show Off"))}
  def scalabilityGetProof = Action {implicit request => Ok(views.html.scalability.getProof("Scalability Get Proof"))}
  def productivityShowOff = Action {implicit request => Ok(views.html.productivity.showOff("Productivity Show Off"))}
  def productivityGetProof = Action {implicit request => Ok(views.html.productivity.getProof("Productivity Get Proof"))}
  def modernizeShowOff = Action {implicit request => Ok(views.html.modernize.showOff("Modernize Show Off"))}
  def modernizeGetProof = Action {implicit request => Ok(views.html.modernize.getProof("Modernize Get Proof"))}
  def agilityQualityShowOff = Action {implicit request => Ok(views.html.agilityQuality.showOff("Agility & Quality Show Off"))}
  def agilityQualityGetProof = Action {implicit request => Ok(views.html.agilityQuality.getProof("Agility & Quality Get Proof"))}
  def convince = Action {implicit request => Ok(views.html.convince("Convince"))}
  def resources = Action {implicit request => Ok(views.html.resources("Resources"))}
  def thankYou = Action {implicit request => Ok(views.html.thankYou("Thank You"))}
}