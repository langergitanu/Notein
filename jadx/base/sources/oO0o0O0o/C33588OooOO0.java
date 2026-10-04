package oO0o0O0o;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0O0OoO0.C25898OooO0Oo;
import oO0o0O0O.C33568OooO0oO;

/* JADX INFO: renamed from: oO0o0O0o.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33588OooOO0 implements Serializable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Pattern f121262OooOo0o;

    /* JADX INFO: renamed from: oO0o0O0o.OooOO0$OooO00o */
    public static final class OooO00o implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f121263OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f121264OooOo0o;

        public OooO00o(String str, int i) {
            this.f121264OooOo0o = str;
            this.f121263OooOo = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f121264OooOo0o, this.f121263OooOo);
            kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
            return new C33588OooOO0(patternCompile);
        }
    }

    public C33588OooOO0(Pattern pattern) {
        this.f121262OooOo0o = pattern;
    }

    public static C33568OooO0oO OooO00o(final C33588OooOO0 c33588OooOO0, final String str) {
        c33588OooOO0.getClass();
        if (str.length() < 0) {
            StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(0, "Start index out of bounds: ", ", input length: ");
            sbOooO0OO.append(str.length());
            throw new IndexOutOfBoundsException(sbOooO0OO.toString());
        }
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: oO0o0O0o.OooO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                String str2 = str;
                Matcher matcher = this.f121229OooOo0o.f121262OooOo0o.matcher(str2);
                kotlin.jvm.internal.OooOOO0.OooO0o(matcher, "matcher(...)");
                return C25898OooO0Oo.OooO00o(matcher, 0, str2);
            }
        };
        C33589OooOO0O nextFunction = C33589OooOO0O.f121265OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(nextFunction, "nextFunction");
        return new C33568OooO0oO(oooO00o, nextFunction);
    }

    private final Object writeReplace() {
        Pattern pattern = this.f121262OooOo0o;
        String strPattern = pattern.pattern();
        kotlin.jvm.internal.OooOOO0.OooO0o(strPattern, "pattern(...)");
        return new OooO00o(strPattern, pattern.flags());
    }

    public final boolean OooO0O0(String input) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        return this.f121262OooOo0o.matcher(input).matches();
    }

    public final String OooO0OO(String input, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(input, "input");
        String strReplaceAll = this.f121262OooOo0o.matcher(input).replaceAll(str);
        kotlin.jvm.internal.OooOOO0.OooO0o(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f121262OooOo0o.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
        return string;
    }

    public C33588OooOO0(String str) {
        Pattern patternCompile = Pattern.compile(str);
        kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
        this.f121262OooOo0o = patternCompile;
    }
}
