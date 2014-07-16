Exercise1.ex1_imperative()
Exercise1.ex1_functional()


//Exercise2_v2.ex2_imperative()
Exercise2_v2.ex2_functional()
Exercise3.ruleSequence("1010", List(Exercise3.ruleOne, Exercise3.ruleZero))


Exercise4.pipeline_each(List(new Exercise4.Band("sunset rubdown", "UK", false), new Exercise4.Band("a silver mt. zion", "Spain", true)),
                        List(Exercise4.set_canada_as_country, Exercise4.strip_punctuation_from_name, Exercise4.capitalize_names))



Exercise4v2.pipeline_each(Exercise4v2.bands,
  List(Exercise4v2.set_canada_as_country,
    Exercise4v2.strip_punctuation_from_name,
    Exercise4v2.capitalize_names))