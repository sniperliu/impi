(defproject impi "0.0.1"
  :description "ClojureScript library for using Pixi.js through immutable data"
  :url "https://github.com/weavejester/impi"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.228"]
                 [weavejester/pixi "4.0.0-8fdb17a-0"]]
  :plugins [[lein-cljsbuild "1.1.3"]]
  :cljsbuild
  {:builds
   {:main
    {:source-paths ["src"]
     :compiler     {:output-to "target/main.js"}}}})
