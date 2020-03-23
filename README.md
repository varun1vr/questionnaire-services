# questionnaire-services

# clone the repo
# checkout master branch
# create a schema using below query
# "create schema questionnaire"
# create tables
# table question
CREATE TABLE `tbl_question` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`value` VARCHAR(255) NULL DEFAULT NULL,
	`ref_answer_id` INT(11) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
# table answer
CREATE TABLE `tbl_answer` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`question_id` INT(11) NULL DEFAULT NULL,
	`value` VARCHAR(255) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)

# Resolve all the dependency in repo in IDE
# Run main method in class "QuestionnaireApplication"


