# birthday-bot

[![Build Status](https://travis-ci.org/amcintosh/birthday-bot.svg?branch=master)](https://travis-ci.org/amcintosh/birthday-bot)

Parse our company birthday list and send out slack message for today's birthdays.

## Usage

Create a config file using `/resources/config.edn.sample` as a...well...sample.

By default birthday-bot will look for load from `/resources/config.edn`, which is useful if using `lein run` or if it has been compiled with your configuration included, but otherwise you should use `-c FILE` to specify your configuration.

    $ java -jar birthday-bot-0.1.0-standalone.jar -c /path/to/config.edn

We maintain our birthday list with a page in confluence. The table has a layout of:

```	
<p><strong>JANUARY</strong></p>
<div>
	<table class="confluenceTable">
		<tbody>
			<tr>
				<td colspan="1" class="confluenceTd">Single Person</td>
				<td colspan="1" class="confluenceTd">Jan-4</td>
			</tr>
			<tr>
				<td class="confluenceTd">
					<p>Person 1 &amp;</p>
					<p>Person 2 &amp;</p>
					<p>Person 3</p>
				</td>
				<td class="confluenceTd">Jan-5</td>
			</tr>
		</tbody>
	</table>
</div>
```

## Options

```
  -c, --config FILE  Config File
  -v                 Logging Verbosity level
  -h, --help
```

## Examples

...

### Bugs
