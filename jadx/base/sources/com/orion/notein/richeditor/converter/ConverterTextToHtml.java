package com.orion.notein.richeditor.converter;

import OooOo.C20485OooOoO;
import OooOoo.C20593OooO0Oo;
import android.text.TextUtils;
import android.util.Patterns;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.api.format.RTHtml;
import com.orion.notein.richeditor.api.format.RTPlainText;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class ConverterTextToHtml {
    private static final String BITCOIN_URI_PATTERN = "bitcoin:[1-9a-km-zA-HJ-NP-Z]{27,34}(\\?[a-zA-Z0-9$\\-_.+!*'(),%:@&=]*)?";
    private static final int TEXT_TO_HTML_EXTRA_BUFFER_LENGTH = 512;
    private static final boolean USE_REPLACE_ALL = false;

    public static RTHtml convert(RTPlainText rTPlainText) {
        return new RTHtml(RTFormat.HTML, convert(rTPlainText.getText()));
    }

    private static void linkifyText(String str, StringBuffer stringBuffer) {
        Matcher matcher = Patterns.WEB_URL.matcher(replaceAll(str, BITCOIN_URI_PATTERN, "<a href=\"$0\">$0</a>"));
        while (matcher.find()) {
            int iStart = matcher.start();
            if (iStart != 0 && (iStart == 0 || str.charAt(iStart - 1) == '@')) {
                matcher.appendReplacement(stringBuffer, "$0");
            } else if (matcher.group().indexOf(58) > 0) {
                matcher.appendReplacement(stringBuffer, "<a href=\"$0\">$0</a>");
            } else {
                matcher.appendReplacement(stringBuffer, "<a href=\"http://$0\">$0</a>");
            }
        }
        matcher.appendTail(stringBuffer);
    }

    private static String replaceAll(String str, String str2, String str3) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, str3);
            z = true;
        }
        if (!z) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public String applyAlignCenterStyle(String str) {
        return C20593OooO0Oo.OooO0O0("<div align=\"center\">", str, "</div>");
    }

    public String applyAlignLeftStyle(String str) {
        return C20593OooO0Oo.OooO0O0("<div align=\"left\">", str, "</div>");
    }

    public String applyAlignRightStyle(String str) {
        return C20593OooO0Oo.OooO0O0("<div align=\"right\">", str, "</div>");
    }

    public String applyBoldStyle(String str) {
        return C20593OooO0Oo.OooO0O0("<b>", str, "</b>");
    }

    public String applyFontStyle(String str, String str2, int i, int i2) {
        StringBuilder sb = new StringBuilder(Integer.toHexString(i2 + 16777216));
        while (sb.length() < 6) {
            sb.insert(0, "0");
        }
        if (str2.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("<font style=\"font-size:");
            sb2.append(i);
            sb2.append("px;legacy-size:false;color:#");
            sb2.append((Object) sb);
            sb2.append("\">");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb2, str, "</font>");
        }
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "<font face=\"", str2, "\" style=\"font-size:", "px;legacy-size:false;color:#");
        sbOooO0OO.append((Object) sb);
        sbOooO0OO.append("\">");
        sbOooO0OO.append(str);
        sbOooO0OO.append("</font>");
        return sbOooO0OO.toString();
    }

    public String applyItalicStyle(String str) {
        return C20593OooO0Oo.OooO0O0("<i>", str, "</i>");
    }

    public String applyUnderlineStyle(String str) {
        return C20593OooO0Oo.OooO0O0("<u>", str, "</u>");
    }

    public static String convert(String str) {
        String strHtmlEncode = str == null ? "" : TextUtils.htmlEncode(str);
        StringBuffer stringBuffer = new StringBuffer(strHtmlEncode.length() + 512);
        linkifyText(strHtmlEncode, stringBuffer);
        return stringBuffer.toString().replace(IOUtils.LINE_SEPARATOR_UNIX, "<br>\n").replace("&apos;", "&#39;");
    }
}
