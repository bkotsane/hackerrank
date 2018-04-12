/**
In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

    The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.

    Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.

    Tags can consist of any printable characters.

Input Format

The first line of input contains a single integer, (the number of lines).
The subsequent lines each contain a line of text.

Constraints

    Each line contains a maximum of printable characters.
    The total number of characters in all test cases will not exceed .

Output Format

For each line, print the content enclosed within valid tags.
If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.

**/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution{
   public static void main(String[] args){
      Pattern pattern = Pattern.compile("(<|</)[^<>/]+>");
       
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String line = in.nextLine();

			Matcher matcher = pattern.matcher(line);
			int index = 0;
			List<String> contentslist = new ArrayList<String>();
			Stack<String> tagStack = new Stack<String>();
			String content = null;
			boolean lastStart = false;
			while (matcher.find()) {
				String tag = matcher.group();

				boolean start;
				String tagName;
				if (tag.startsWith("</")) {
					start = false;
					tagName = tag.substring(2, tag.length() - 1);
				} else {
					start = true;
					tagName = tag.substring(1, tag.length() - 1);
				}

				if (start) {
					tagStack.push(tagName);
				} else {
					if (!tagStack.empty() && tagStack.pop().equals(tagName)) {
						if (lastStart) {
							content = line.substring(index, matcher.start());
							if (!content.isEmpty()) {
								contentslist.add(content);
							}
						}
					}
				}

				index = matcher.end();
				lastStart = start;
			}
            
            	for(String cont : contentslist) {
	            System.out.println(cont);
	        }
                if (contentslist.size()==0)
                System.out.println("None");
          testCases--;
      }

	in.close();
   }
}
