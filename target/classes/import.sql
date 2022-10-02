--items
INSERT INTO `bcp_project`.`item` (`id`, `title`) VALUES ('1', 'Item 1');
INSERT INTO `bcp_project`.`item` (`id`, `title`) VALUES ('2', 'Item 2');
INSERT INTO `bcp_project`.`item` (`id`, `title`) VALUES ('3', 'Item 3');
--reviews
INSERT INTO `bcp_project`.`review` (`review_id`, `review_name`, `rating`, `cp_fk`) VALUES ('1', 'review 1', '5', '1');
INSERT INTO `bcp_project`.`review` (`review_id`, `review_name`, `rating`, `cp_fk`) VALUES ('2', 'review 2', '4', '1');
INSERT INTO `bcp_project`.`review` (`review_id`, `review_name`, `rating`, `cp_fk`) VALUES ('3', 'review 3', '5', '2');
INSERT INTO `bcp_project`.`review` (`review_id`, `review_name`, `rating`, `cp_fk`) VALUES ('4', 'review 4', '2', '2');
