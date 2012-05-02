(ns jeancritter.models.user)

(defn new-user [user-name age]
  { :user-name user-name,
    :age age,
    :id (str "users/" user-name)})