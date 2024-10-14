# vijual

Vijual is a graph layout engine conceptually similar to graphviz. However, it uses different layout algorithms, creating graphs with a different aesthetic. Vijual uses specialized algorithms for optimal rendering of trees, binary trees, directed, and undirected graphs. Also, it has robust abilities for generating attractive ASCII graphs (as well as traditional bitmap graphs) making it well suited for debugging and exploratory programming directly from the Clojure REPL. Vijual is still an alpha-grade project at this time- Expect many improvements and changes to this library in the near future.

## Usage

Vijual is easy to install through the use of leiningen and clojars. To learn how to use leiningen refer to the documentation available at the leiningen home page. Then, simply include [vijual "0.1.0-SNAPSHOT"] as a dependency in your project.clj to include this library in your programs. You can also access the source of Vijual on github.

## Functions

- draw-tree
- draw-tree-image
- draw-graph
- draw-graph-image
- draw-directed-graph
- draw-directed-graph-image
- draw-binary-tree

## Install Case Study

This is an insertion from someone who found `vijual` in 2024 
and tried to run on a Debian-based distro with `clojure >= 1.10`
as shell command:

Relevant Debian packages:

```
Desired=Unknown/Install/Remove/Purge/Hold
| Status=Not/Inst/Conf-files/Unpacked/halF-conf/Half-inst/trig-aWait/Trig-pend
|/ Err?=(none)/Reinst-required (Status,Err: uppercase=bad)
||/ Name                          Version             Architecture Description
+++-=============================-===================-============-===========================================================
ii  clojure                       1.11.1-2            all          Lisp dialect for the JVM
ii  leiningen                     2.10.0-2            all          Automation tool and dependency manager for Clojure projects
ii  openjdk-17-jre-headless:amd64 17.0.12+7-2~deb12u1 amd64        OpenJDK Java runtime, using Hotspot JIT (headless)
```

Git branch: `uucp.hu/master` <https://github.com/bAndie91/vijual/tree/uucp.hu/master> (commit `ae1a286`)

Commands:

```
$ lein uberjar
Retrieving org/clojure/clojure/1.10.1/clojure-1.10.1.pom from central
Retrieving org/clojure/spec.alpha/0.2.176/spec.alpha-0.2.176.pom from central
Retrieving org/clojure/pom.contrib/0.2.2/pom.contrib-0.2.2.pom from central
Retrieving org/clojure/core.specs.alpha/0.2.44/core.specs.alpha-0.2.44.pom from central
Retrieving org/clojure/math.numeric-tower/0.0.4/math.numeric-tower-0.0.4.pom from central
Retrieving org/clojure/pom.contrib/0.1.2/pom.contrib-0.1.2.pom from central
Retrieving org/sonatype/oss/oss-parent/7/oss-parent-7.pom from central
Retrieving org/clojure/clojure/1.4.0/clojure-1.4.0.pom from central
Retrieving org/sonatype/oss/oss-parent/5/oss-parent-5.pom from central
Retrieving org/clojure/spec.alpha/0.2.176/spec.alpha-0.2.176.jar from central
Retrieving org/clojure/math.numeric-tower/0.0.4/math.numeric-tower-0.0.4.jar from central
Retrieving org/clojure/core.specs.alpha/0.2.44/core.specs.alpha-0.2.44.jar from central
Retrieving org/clojure/clojure/1.10.1/clojure-1.10.1.jar from central
Compiling vijual
Created /home/hband/src/vijual/target/vijual-0.1.0.jar
Created /home/hband/src/vijual/target/vijual-0.1.0-standalone.jar
```
```
$ java -jar target/vijual-0.1.0-standalone.jar draw-directed-graph "[[:a :b] [:b :c] [:c :d] [:d :e] [:e :f] [:f :a]]"
╭───╮   ╭───╮   ╭───╮
│ f │   │   │   │   │
│   │━━▶│ a │━━▶│ b │
│   │   │   │   │   │
╰───╯   │   │   │   │
  ▲     │   │   │   │
  ┃     ╰───╯   ╰───╯
  ┃               ┃
╭─────╮   ╭───╮   ┗━┓
│  e  │   │   │     ▼
│     │◀━━│ d │   ╭───╮
│     │   │   │   │ c │
╰─────╯   │   │◀━━│   │
          │   │   │   │
          ╰───╯   ╰───╯
```
```
$ java -jar target/vijual-0.1.0-standalone.jar draw-directed-graph-image "[[:a :b] [:b :c] [:c :d] [:d :e] [:e :f] [:f :a]]" > /tmp/graph.png
$ file /tmp/graph.png
/tmp/graph.png: PNG image data, 166 x 108, 8-bit/color RGBA, non-interlaced
```

## License

GPLv3
