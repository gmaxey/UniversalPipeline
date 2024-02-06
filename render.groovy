/*

	usage: groovy render.groovy templatFile valuesFile
	valuesFile should be in yaml format

*/
import groovy.yaml.YamlSlurper

def template = new File(args[0]).text
def values = new File(args[1]).text

def binding = new YamlSlurper().parseText(values)

def engine = new groovy.text.SimpleTemplateEngine()
println engine.createTemplate(template).make(binding).toString()
