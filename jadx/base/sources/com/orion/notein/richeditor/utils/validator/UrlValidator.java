package com.orion.notein.richeditor.utils.validator;

import com.microsoft.identity.common.java.AuthenticationConstants;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class UrlValidator implements Serializable {
    public static final long ALLOW_2_SLASHES = 2;
    public static final long ALLOW_ALL_SCHEMES = 1;
    public static final long ALLOW_LOCAL_URLS = 8;
    private static final String AUTHORITY_CHARS_REGEX = "\\p{Alnum}\\-\\.";
    public static final long NO_FRAGMENTS = 4;
    private static final int PARSE_AUTHORITY_EXTRA = 3;
    private static final int PARSE_AUTHORITY_HOST_IP = 1;
    private static final int PARSE_AUTHORITY_PORT = 2;
    private static final int PARSE_URL_AUTHORITY = 4;
    private static final int PARSE_URL_FRAGMENT = 9;
    private static final int PARSE_URL_PATH = 5;
    private static final int PARSE_URL_QUERY = 7;
    private static final int PARSE_URL_SCHEME = 2;
    private static final long serialVersionUID = 7557161713937335013L;
    private final Set allowedSchemes;
    private final RegexValidator authorityValidator;
    private final long options;
    private static final String URL_REGEX = "^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?";
    private static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);
    private static final String SCHEME_REGEX = "^\\p{Alpha}[\\p{Alnum}\\+\\-\\.]*";
    private static final Pattern SCHEME_PATTERN = Pattern.compile(SCHEME_REGEX);
    private static final String AUTHORITY_REGEX = "^([\\p{Alnum}\\-\\.]*)(:\\d*)?(.*)?";
    private static final Pattern AUTHORITY_PATTERN = Pattern.compile(AUTHORITY_REGEX);
    private static final String PATH_REGEX = "^(/[-\\w:@&?=+,.!/~*'%$_;\\(\\)]*)?$";
    private static final Pattern PATH_PATTERN = Pattern.compile(PATH_REGEX);
    private static final String QUERY_REGEX = "^(.*)$";
    private static final Pattern QUERY_PATTERN = Pattern.compile(QUERY_REGEX);
    private static final String PORT_REGEX = "^:(\\d{1,5})$";
    private static final Pattern PORT_PATTERN = Pattern.compile(PORT_REGEX);
    private static final String[] DEFAULT_SCHEMES = {"http", AuthenticationConstants.HTTPS_PROTOCOL_STRING, "ftp"};
    private static final UrlValidator DEFAULT_URL_VALIDATOR = new UrlValidator();

    public UrlValidator() {
        this((String[]) null);
    }

    public static UrlValidator getInstance() {
        return DEFAULT_URL_VALIDATOR;
    }

    private boolean isOff(long j) {
        return (j & this.options) == 0;
    }

    private boolean isOn(long j) {
        return (j & this.options) > 0;
    }

    public int countToken(String str, String str2) {
        int iIndexOf = 0;
        int i = 0;
        while (iIndexOf != -1) {
            iIndexOf = str2.indexOf(str, iIndexOf);
            if (iIndexOf > -1) {
                iIndexOf++;
                i++;
            }
        }
        return i;
    }

    public boolean isValid(String str) {
        if (str == null) {
            return false;
        }
        Matcher matcher = URL_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        String strGroup = matcher.group(2);
        if (!isValidScheme(strGroup)) {
            return false;
        }
        String strGroup2 = matcher.group(4);
        return (("file".equals(strGroup) && "".equals(strGroup2)) || isValidAuthority(strGroup2)) && isValidPath(matcher.group(5)) && isValidQuery(matcher.group(7)) && isValidFragment(matcher.group(9));
    }

    public boolean isValidAuthority(String str) {
        if (str == null) {
            return false;
        }
        RegexValidator regexValidator = this.authorityValidator;
        if (regexValidator != null && regexValidator.isValid(str)) {
            return true;
        }
        Matcher matcher = AUTHORITY_PATTERN.matcher(DomainValidator.unicodeToASCII(str));
        if (!matcher.matches()) {
            return false;
        }
        String strGroup = matcher.group(1);
        if (!DomainValidator.getInstance(isOn(8L)).isValid(strGroup) && !InetAddressValidator.getInstance().isValid(strGroup)) {
            return false;
        }
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null && !PORT_PATTERN.matcher(strGroup2).matches()) {
            return false;
        }
        String strGroup3 = matcher.group(3);
        return strGroup3 == null || strGroup3.trim().length() <= 0;
    }

    public boolean isValidFragment(String str) {
        if (str == null) {
            return true;
        }
        return isOff(4L);
    }

    public boolean isValidPath(String str) {
        if (str == null || !PATH_PATTERN.matcher(str).matches()) {
            return false;
        }
        int iCountToken = countToken("//", str);
        if (isOff(2L) && iCountToken > 0) {
            return false;
        }
        int iCountToken2 = countToken("/", str);
        int iCountToken3 = countToken("..", str);
        return iCountToken3 <= 0 || (iCountToken2 - iCountToken) - 1 > iCountToken3;
    }

    public boolean isValidQuery(String str) {
        if (str == null) {
            return true;
        }
        return QUERY_PATTERN.matcher(str).matches();
    }

    public boolean isValidScheme(String str) {
        if (str != null && SCHEME_PATTERN.matcher(str).matches()) {
            return !isOff(1L) || this.allowedSchemes.contains(str.toLowerCase(Locale.ENGLISH));
        }
        return false;
    }

    public UrlValidator(String[] strArr) {
        this(strArr, 0L);
    }

    public UrlValidator(long j) {
        this(null, null, j);
    }

    public UrlValidator(String[] strArr, long j) {
        this(strArr, null, j);
    }

    public UrlValidator(RegexValidator regexValidator, long j) {
        this(null, regexValidator, j);
    }

    public UrlValidator(String[] strArr, RegexValidator regexValidator, long j) {
        this.options = j;
        if (isOn(1L)) {
            this.allowedSchemes = Collections.EMPTY_SET;
        } else {
            strArr = strArr == null ? DEFAULT_SCHEMES : strArr;
            this.allowedSchemes = new HashSet(strArr.length);
            for (String str : strArr) {
                this.allowedSchemes.add(str.toLowerCase(Locale.ENGLISH));
            }
        }
        this.authorityValidator = regexValidator;
    }
}
