<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE abiword PUBLIC "-//ABISOURCE//DTD AWML 1.0 Strict//EN" "http://www.abisource.com/awml.dtd">
<abiword template="false" xmlns:ct="http://www.abisource.com/changetracking.dtd" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:math="http://www.w3.org/1998/Math/MathML" xid-max="37" xmlns:dc="http://purl.org/dc/elements/1.1/" styles="unlocked" fileformat="1.0" xmlns:svg="http://www.w3.org/2000/svg" xmlns:awml="http://www.abisource.com/awml.dtd" xmlns="http://www.abisource.com/awml.dtd" xmlns:xlink="http://www.w3.org/1999/xlink" version="0.99.2" xml:space="preserve" props="dom-dir:ltr; document-footnote-restart-section:0; document-endnote-type:numeric; document-endnote-place-enddoc:1; document-endnote-initial:1; lang:en-US; document-endnote-restart-section:0; document-footnote-restart-page:0; document-footnote-type:numeric; document-footnote-initial:1; document-endnote-place-endsection:0">
<!-- ======================================================================== -->
<!-- This file is an AbiWord document.                                        -->
<!-- AbiWord is a free, Open Source word processor.                           -->
<!-- More information about AbiWord is available at http://www.abisource.com/ -->
<!-- You should not edit this file by hand.                                   -->
<!-- ======================================================================== -->

<metadata>
<m key="abiword.generator">AbiWord</m>
<m key="dc.creator">abhi</m>
<m key="dc.format">application/x-abiword</m>
</metadata>
<rdf>
</rdf>
<history version="1" edit-time="339" last-saved="1386478948" uid="257e91d4-5fc5-11e3-86b2-def38e42a19b">
<version id="1" started="1386478948" uid="ef8a61ec-5fc5-11e3-86b2-def38e42a19b" auto="0" top-xid="37"/>
</history>
<styles>
<s type="P" name="Normal" followedby="Current Settings" props="font-family:Times New Roman; margin-top:0pt; color:000000; margin-left:0pt; text-position:normal; widows:2; font-style:normal; text-indent:0in; font-variant:normal; font-weight:normal; margin-right:0pt; font-size:12pt; text-decoration:none; margin-bottom:0pt; line-height:1.0; bgcolor:transparent; text-align:left; font-stretch:normal"/>
</styles>
<pagesize pagetype="Letter" orientation="portrait" width="8.500000" height="11.000000" units="in" page-scale="1.000000"/>
<section xid="36" props="page-margin-footer:0.5in; page-margin-header:0.5in">
<p style="Normal" xid="37" props="text-align:left; dom-dir:ltr"><c>import java.io.*;</c></p>
<p style="Normal" xid="2" props="text-align:left; dom-dir:ltr"><c></c><c> import java.util.*;</c></p>
<p style="Normal" xid="3" props="text-align:left; dom-dir:ltr"><c></c><c> class universe</c></p>
<p style="Normal" xid="4" props="text-align:left; dom-dir:ltr"><c></c><c> {</c></p>
<p style="Normal" xid="5" props="text-align:left; dom-dir:ltr"><c></c><c> public static void main(String[] args)</c></p>
<p style="Normal" xid="6" props="text-align:left; dom-dir:ltr"><c></c><c> {</c></p>
<p style="Normal" xid="7" props="text-align:left; dom-dir:ltr"><c></c><c> Scanner sc=new Scanner(System.in);</c></p>
<p style="Normal" xid="8" props="text-align:left; dom-dir:ltr"><c></c><c> List&lt;Integer&gt; a=new ArrayList&lt;Integer&gt;();</c></p>
<p style="Normal" xid="9" props="text-align:left; dom-dir:ltr"><c></c><c> int t;</c></p>
<p style="Normal" xid="10" props="text-align:left; dom-dir:ltr"><c></c><c> do </c></p>
<p style="Normal" xid="11" props="text-align:left; dom-dir:ltr"><c></c><c>{ </c></p>
<p style="Normal" xid="12" props="text-align:left; dom-dir:ltr"><c></c><c>System.out.println("Enter the number:"); </c></p>
<p style="Normal" xid="13" props="text-align:left; dom-dir:ltr"><c></c><c>t=sc.nextInt();</c></p>
<p style="Normal" xid="14" props="text-align:left; dom-dir:ltr"><c></c><c> a.add(t); </c></p>
<p style="Normal" xid="15" props="text-align:left; dom-dir:ltr"><c></c><c>}while(t!=42);</c></p>
<p style="Normal" xid="17" props="text-align:left; dom-dir:ltr"><c></c><c> System.out.println(a.size());</c></p>
<p style="Normal" xid="18" props="text-align:left; dom-dir:ltr"><c></c><c> for(int i=0;i&lt;(a.size()-1);i++) </c></p>
<p style="Normal" xid="19" props="text-align:left; dom-dir:ltr"><c></c><c>{</c></p>
<p style="Normal" xid="20" props="text-align:left; dom-dir:ltr"><c></c><c> for(int j=i+1;j&lt;(a.size());j++)</c></p>
<p style="Normal" xid="21" props="text-align:left; dom-dir:ltr"><c></c><c> {</c></p>
<p style="Normal" xid="22" props="text-align:left; dom-dir:ltr"><c></c><c> int temp=a.get(i);</c></p>
<p style="Normal" xid="23" props="text-align:left; dom-dir:ltr"><c></c><c> if(a.get(j)&lt;a.get(i))</c></p>
<p style="Normal" xid="24" props="text-align:left; dom-dir:ltr"><c></c><c> { </c></p>
<p style="Normal" xid="25" props="text-align:left; dom-dir:ltr"><c></c><c>a.set(i,a.get(j)); </c></p>
<p style="Normal" xid="26" props="text-align:left; dom-dir:ltr"><c></c><c>a.set(j,temp);</c></p>
<p style="Normal" xid="27" props="text-align:left; dom-dir:ltr"><c></c><c> }</c></p>
<p style="Normal" xid="28" props="text-align:left; dom-dir:ltr"><c></c><c> }</c></p>
<p style="Normal" xid="29" props="text-align:left; dom-dir:ltr"><c></c><c> }</c></p>
<p style="Normal" xid="30" props="text-align:left; dom-dir:ltr"><c></c><c> for(int i: a)</c></p>
<p style="Normal" xid="31" props="text-align:left; dom-dir:ltr"><c></c><c> {</c></p>
<p style="Normal" xid="32" props="text-align:left; dom-dir:ltr"><c></c><c> System.out.println(i); </c></p>
<p style="Normal" xid="33" props="text-align:left; dom-dir:ltr"><c></c><c>} </c></p>
<p style="Normal" xid="34" props="text-align:left; dom-dir:ltr"><c></c><c>}</c></p>
<p style="Normal" xid="35" props="text-align:left; dom-dir:ltr"><c></c><c> }</c></p>
<p style="Normal" xid="1" props="text-align:left; dom-dir:ltr"><c></c></p>
</section>
</abiword>
