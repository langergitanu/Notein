package oO00OoO0;

import com.aspose.words.ControlChar;
import com.orion.notein.domain.models.cloud.NoteInDriveError;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oO00OoO.C32280OooO0O0;
import oO00OoO0.C32286OooO0oO;

/* JADX INFO: renamed from: oO00OoO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32281OooO00o {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final Pattern f116021OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final C32286OooO0oO.OooO00o f116022OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final Pattern f116023OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final Pattern f116024OooOo0o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C32285OooO0o0 f116025OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f116034OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C32286OooO0oO f116035OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public C32286OooO0oO f116036OooOO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final StringBuilder f116026OooO00o = new StringBuilder();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f116027OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StringBuilder f116028OooO0OO = new StringBuilder();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final StringBuilder f116029OooO0Oo = new StringBuilder();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f116031OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f116030OooO0o = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f116032OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f116033OooO0oo = false;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f116038OooOOO0 = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final StringBuilder f116037OooOOO = new StringBuilder();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f116039OooOOOO = false;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public String f116040OooOOOo = "";

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final StringBuilder f116042OooOOo0 = new StringBuilder();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ArrayList f116041OooOOo = new ArrayList();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final C32280OooO0O0 f116043OooOOoo = new C32280OooO0O0(64);

    static {
        C32286OooO0oO.OooO00o oooO00o = new C32286OooO0oO.OooO00o();
        oooO00o.f116145OooooOO = "<ignored>";
        oooO00o.f116148Oooooo0 = "NA";
        f116022OooOo00 = oooO00o;
        f116021OooOo0 = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        f116023OooOo0O = Pattern.compile("[- ]");
        f116024OooOo0o = Pattern.compile("\u2008");
    }

    public C32281OooO00o(C32285OooO0o0 c32285OooO0o0, String str) {
        this.f116025OooO = c32285OooO0o0;
        this.f116034OooOO0 = str;
        C32286OooO0oO c32286OooO0oOOooO0oO = OooO0oO(str);
        this.f116036OooOO0o = c32286OooO0oOOooO0oO;
        this.f116035OooOO0O = c32286OooO0oOOooO0oO;
    }

    public final String OooO(char c) {
        StringBuilder sb = this.f116028OooO0OO;
        sb.append(c);
        boolean zIsDigit = Character.isDigit(c);
        StringBuilder sb2 = this.f116029OooO0Oo;
        StringBuilder sb3 = this.f116042OooOOo0;
        if (!zIsDigit && (sb.length() != 1 || !C32285OooO0o0.f116068OooOOOo.matcher(Character.toString(c)).matches())) {
            this.f116031OooO0o0 = false;
            this.f116030OooO0o = true;
        } else if (c == '+') {
            sb2.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            sb2.append(c);
            sb3.append(c);
        }
        boolean z = this.f116031OooO0o0;
        StringBuilder sb4 = this.f116037OooOOO;
        if (!z) {
            if (this.f116030OooO0o) {
                return sb.toString();
            }
            if (!OooO0Oo()) {
                if (this.f116040OooOOOo.length() > 0) {
                    sb3.insert(0, this.f116040OooOOOo);
                    sb4.setLength(sb4.lastIndexOf(this.f116040OooOOOo));
                }
                if (!this.f116040OooOOOo.equals(OooOOO0())) {
                    sb4.append(ControlChar.SPACE_CHAR);
                    this.f116031OooO0o0 = true;
                    this.f116033OooO0oo = false;
                    this.f116041OooOOo.clear();
                    this.f116038OooOOO0 = 0;
                    this.f116026OooO00o.setLength(0);
                    this.f116027OooO0O0 = "";
                    return OooO0O0();
                }
            } else if (OooO0OO()) {
                this.f116031OooO0o0 = true;
                this.f116033OooO0oo = false;
                this.f116041OooOOo.clear();
                this.f116038OooOOO0 = 0;
                this.f116026OooO00o.setLength(0);
                this.f116027OooO0O0 = "";
                return OooO0O0();
            }
            return sb.toString();
        }
        int length = sb2.length();
        if (length == 0 || length == 1 || length == 2) {
            return sb.toString();
        }
        if (length == 3) {
            if (!OooO0Oo()) {
                this.f116040OooOOOo = OooOOO0();
                return OooO0O0();
            }
            this.f116033OooO0oo = true;
        }
        if (this.f116033OooO0oo) {
            if (OooO0OO()) {
                this.f116033OooO0oo = false;
            }
            return ((Object) sb4) + sb3.toString();
        }
        if (this.f116041OooOOo.size() <= 0) {
            return OooO0O0();
        }
        String strOooOO0 = OooOO0(c);
        String strOooO0o0 = OooO0o0();
        if (strOooO0o0.length() > 0) {
            return strOooO0o0;
        }
        OooOO0o(sb3.toString());
        return OooOO0O() ? OooO0oo() : this.f116031OooO0o0 ? OooO00o(strOooOO0) : sb.toString();
    }

    public final String OooO00o(String str) {
        StringBuilder sb = this.f116037OooOOO;
        int length = sb.length();
        if (!this.f116039OooOOOO || length <= 0 || sb.charAt(length - 1) == ' ') {
            return ((Object) sb) + str;
        }
        return new String(sb) + ControlChar.SPACE_CHAR + str;
    }

    public final String OooO0O0() {
        StringBuilder sb = this.f116042OooOOo0;
        if (sb.length() < 3) {
            return OooO00o(sb.toString());
        }
        String string = sb.toString();
        for (OooO0o oooO0o : (this.f116032OooO0oO && this.f116040OooOOOo.length() == 0 && this.f116036OooOO0o.f116156o00oO0O.size() > 0) ? this.f116036OooOO0o.f116156o00oO0O : this.f116036OooOO0o.f116157o00oO0o) {
            if (this.f116040OooOOOo.length() > 0) {
                String str = oooO0o.f116056OooOoOO;
                if ((str.length() == 0 || C32285OooO0o0.f116080OooOoo0.matcher(str).matches()) && !oooO0o.f116058OooOoo0 && !oooO0o.f116057OooOoo) {
                }
            }
            if (this.f116040OooOOOo.length() == 0 && !this.f116032OooO0oO) {
                String str2 = oooO0o.f116056OooOoOO;
                if (str2.length() == 0 || C32285OooO0o0.f116080OooOoo0.matcher(str2).matches() || oooO0o.f116058OooOoo0) {
                }
            }
            if (f116021OooOo0.matcher(oooO0o.f116052OooOo).matches()) {
                this.f116041OooOOo.add(oooO0o);
            }
        }
        OooOO0o(string);
        String strOooO0o0 = OooO0o0();
        return strOooO0o0.length() > 0 ? strOooO0o0 : OooOO0O() ? OooO0oo() : this.f116028OooO0OO.toString();
    }

    public final boolean OooO0OO() {
        StringBuilder sb;
        C32285OooO0o0 c32285OooO0o0;
        int iOooO0Oo;
        StringBuilder sb2 = this.f116042OooOOo0;
        if (sb2.length() == 0 || (iOooO0Oo = (c32285OooO0o0 = this.f116025OooO).OooO0Oo(sb2, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        sb2.setLength(0);
        sb2.append((CharSequence) sb);
        String strOooOO0O = c32285OooO0o0.OooOO0O(iOooO0Oo);
        if (NoteInDriveError.ERROR_RESOURCE_NOT_EXIST.equals(strOooOO0O)) {
            this.f116036OooOO0o = c32285OooO0o0.OooO0o(iOooO0Oo);
        } else if (!strOooOO0O.equals(this.f116034OooOO0)) {
            this.f116036OooOO0o = OooO0oO(strOooOO0O);
        }
        String string = Integer.toString(iOooO0Oo);
        StringBuilder sb3 = this.f116037OooOOO;
        sb3.append(string);
        sb3.append(ControlChar.SPACE_CHAR);
        this.f116040OooOOOo = "";
        return true;
    }

    public final boolean OooO0Oo() {
        Pattern patternOooO00o = this.f116043OooOOoo.OooO00o("\\+|" + this.f116036OooOO0o.f116148Oooooo0);
        StringBuilder sb = this.f116029OooO0Oo;
        Matcher matcher = patternOooO00o.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f116032OooO0oO = true;
        int iEnd = matcher.end();
        StringBuilder sb2 = this.f116042OooOOo0;
        sb2.setLength(0);
        sb2.append(sb.substring(iEnd));
        StringBuilder sb3 = this.f116037OooOOO;
        sb3.setLength(0);
        sb3.append(sb.substring(0, iEnd));
        if (sb.charAt(0) != '+') {
            sb3.append(ControlChar.SPACE_CHAR);
        }
        return true;
    }

    public final void OooO0o() {
        this.f116028OooO0OO.setLength(0);
        this.f116029OooO0Oo.setLength(0);
        this.f116026OooO00o.setLength(0);
        this.f116038OooOOO0 = 0;
        this.f116027OooO0O0 = "";
        this.f116037OooOOO.setLength(0);
        this.f116040OooOOOo = "";
        this.f116042OooOOo0.setLength(0);
        this.f116031OooO0o0 = true;
        this.f116030OooO0o = false;
        this.f116032OooO0oO = false;
        this.f116033OooO0oo = false;
        this.f116041OooOOo.clear();
        this.f116039OooOOOO = false;
        if (this.f116036OooOO0o.equals(this.f116035OooOO0O)) {
            return;
        }
        this.f116036OooOO0o = OooO0oO(this.f116034OooOO0);
    }

    public final String OooO0o0() {
        for (OooO0o oooO0o : this.f116041OooOOo) {
            Matcher matcher = this.f116043OooOOoo.OooO00o(oooO0o.f116053OooOo0o).matcher(this.f116042OooOOo0);
            if (matcher.matches()) {
                this.f116039OooOOOO = f116023OooOo0O.matcher(oooO0o.f116056OooOoOO).find();
                String strOooO00o = OooO00o(matcher.replaceAll(oooO0o.f116052OooOo));
                if (C32285OooO0o0.OooOOoo(strOooO00o, C32285OooO0o0.f116064OooOO0o).contentEquals(this.f116029OooO0Oo)) {
                    return strOooO00o;
                }
            }
        }
        return "";
    }

    public final C32286OooO0oO OooO0oO(String str) {
        int i;
        C32285OooO0o0 c32285OooO0o0 = this.f116025OooO;
        if (c32285OooO0o0.OooOOO(str)) {
            C32286OooO0oO c32286OooO0oOOooO0oO = c32285OooO0o0.OooO0oO(str);
            if (c32286OooO0oOOooO0oO == null) {
                throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Invalid region code: ", str));
            }
            i = c32286OooO0oOOooO0oO.f116146OooooOo;
        } else {
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Invalid or missing region code (");
            if (str == null) {
                str = CloudMetaExtra.DEFINE_NON_PARENT_ID;
            }
            C32285OooO0o0.f116061OooO0oo.log(level, androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, ") provided."));
            i = 0;
        }
        C32286OooO0oO c32286OooO0oOOooO0oO2 = c32285OooO0o0.OooO0oO(c32285OooO0o0.OooOO0O(i));
        return c32286OooO0oOOooO0oO2 != null ? c32286OooO0oOOooO0oO2 : f116022OooOo00;
    }

    public final String OooO0oo() {
        StringBuilder sb = this.f116042OooOOo0;
        int length = sb.length();
        if (length <= 0) {
            return this.f116037OooOOO.toString();
        }
        String strOooOO0 = "";
        for (int i = 0; i < length; i++) {
            strOooOO0 = OooOO0(sb.charAt(i));
        }
        return this.f116031OooO0o0 ? OooO00o(strOooOO0) : this.f116028OooO0OO.toString();
    }

    public final String OooOO0(char c) {
        StringBuilder sb = this.f116026OooO00o;
        Matcher matcher = f116024OooOo0o.matcher(sb);
        if (!matcher.find(this.f116038OooOOO0)) {
            if (this.f116041OooOOo.size() == 1) {
                this.f116031OooO0o0 = false;
            }
            this.f116027OooO0O0 = "";
            return this.f116028OooO0OO.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c));
        sb.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.f116038OooOOO0 = iStart;
        return sb.substring(0, iStart + 1);
    }

    public final boolean OooOO0O() {
        Iterator it = this.f116041OooOOo.iterator();
        while (it.hasNext()) {
            OooO0o oooO0o = (OooO0o) it.next();
            String str = oooO0o.f116053OooOo0o;
            if (this.f116027OooO0O0.equals(str)) {
                return false;
            }
            String str2 = oooO0o.f116053OooOo0o;
            StringBuilder sb = this.f116026OooO00o;
            sb.setLength(0);
            String str3 = oooO0o.f116052OooOo;
            Matcher matcher = this.f116043OooOOoo.OooO00o(str2).matcher("999999999999999");
            matcher.find();
            String strGroup = matcher.group();
            String strReplaceAll = strGroup.length() < this.f116042OooOOo0.length() ? "" : strGroup.replaceAll(str2, str3).replaceAll("9", "\u2008");
            if (strReplaceAll.length() > 0) {
                sb.append(strReplaceAll);
                this.f116027OooO0O0 = str;
                this.f116039OooOOOO = f116023OooOo0O.matcher(oooO0o.f116056OooOoOO).find();
                this.f116038OooOOO0 = 0;
                return true;
            }
            it.remove();
        }
        this.f116031OooO0o0 = false;
        return false;
    }

    public final void OooOO0o(String str) {
        int length = str.length() - 3;
        Iterator it = this.f116041OooOOo.iterator();
        while (it.hasNext()) {
            OooO0o oooO0o = (OooO0o) it.next();
            if (oooO0o.f116055OooOoO0.size() != 0) {
                if (!this.f116043OooOOoo.OooO00o((String) oooO0o.f116055OooOoO0.get(Math.min(length, oooO0o.f116055OooOoO0.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OooOOO0() {
        int i = this.f116036OooOO0o.f116146OooooOo;
        StringBuilder sb = this.f116037OooOOO;
        StringBuilder sb2 = this.f116042OooOOo0;
        int iEnd = 1;
        if (i != 1 || sb2.charAt(0) != '1' || sb2.charAt(1) == '0' || sb2.charAt(1) == '1') {
            C32286OooO0oO c32286OooO0oO = this.f116036OooOO0o;
            if (c32286OooO0oO.f116153o00Oo0) {
                Matcher matcher = this.f116043OooOOoo.OooO00o(c32286OooO0oO.f116154o00Ooo).matcher(sb2);
                if (!matcher.lookingAt() || matcher.end() <= 0) {
                    iEnd = 0;
                } else {
                    this.f116032OooO0oO = true;
                    iEnd = matcher.end();
                    sb.append(sb2.substring(0, iEnd));
                }
            }
        } else {
            sb.append('1');
            sb.append(ControlChar.SPACE_CHAR);
            this.f116032OooO0oO = true;
        }
        String strSubstring = sb2.substring(0, iEnd);
        sb2.delete(0, iEnd);
        return strSubstring;
    }
}
