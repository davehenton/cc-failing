Testing with `codeclimate` CLI:

```
* - cc-failing : codeclimate analyze -e kibit
Starting analysis
Running kibit: Done!

Analysis complete! Found 0 issues.

```

Testing with kibit directly:

```
* - cc-failing : lein kibit
At src/cc_failing/core.clj:6:
Consider using:
  (count [])
instead of:
  (-> [] count)
```