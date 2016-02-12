# birthday-bot

[![Build Status](https://travis-ci.org/amcintosh/birthday-bot.svg?branch=master)](https://travis-ci.org/amcintosh/birthday-bot)

Parse our company birthday list and send out slack message for today's birthdays.

## Usage

Create a config file using `/resources/config.edn.sample` as a...well...sample.

By default birthday-bot will look for load from `/resources/config.edn` or at the file specified in a BIRTHDAY-CONFIG environment variable.

    $ java -jar birthday-bot-0.1.0-standalone.jar [args]

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

FIXME: listing of options this app accepts.

## Examples

...

### Bugs
