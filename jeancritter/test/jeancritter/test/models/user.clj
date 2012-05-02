(ns jeancritter.test.models.user
  (:use [clojure.test]
        [jeancritter.models.user]))

(deftest can-create-user []
  (let [user-name "bob"
        age 70
        user (new-user user-name age)]
    (is (= (:user-name user) user-name))
    (is (= (:age user) age))
    (is (= (:id user) "users/bob"))))

(run-tests)