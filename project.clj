(defproject vijual "0.1.0" 
  :description "A Graph Layout Library For Clojure" 
  :dependencies [[org.clojure/clojure "1.10.1"] 
                 [org.clojure/math.numeric-tower "0.0.4"]]
  :dev-dependencies [[lein-clojars "0.5.0-SNAPSHOT"]
                     [leiningen/lein-swank "1.1.0"]]
  :repositories [["clojars" "https://clojars.org/repo"] ["central" "https://repo1.maven.org/maven2"]]
  :repl-options {:init-ns vijual}
  :main vijual
  :aot [vijual])
