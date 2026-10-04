package oO0OOOO;

import oO0o0O0o.C33595OooOOo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oO0OOOO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class EnumC32950OooOOo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f119048OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0O0 f119049OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC32950OooOOo0[] f119050OooOoO0;

    /* JADX INFO: renamed from: oO0OOOO.OooOOo0$OooO00o */
    public static final class OooO00o extends EnumC32950OooOOo0 {
        public OooO00o() {
            super("HTML", 1);
        }

        @Override // oO0OOOO.EnumC32950OooOOo0
        public final String OooO00o(String string) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(string, "string");
            return C33595OooOOo.OooOo0O(C33595OooOOo.OooOo0O(string, "<", "&lt;"), ">", "&gt;");
        }
    }

    /* JADX INFO: renamed from: oO0OOOO.OooOOo0$OooO0O0 */
    public static final class OooO0O0 extends EnumC32950OooOOo0 {
        public OooO0O0() {
            super("PLAIN", 0);
        }

        @Override // oO0OOOO.EnumC32950OooOOo0
        public final String OooO00o(String string) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(string, "string");
            return string;
        }
    }

    static {
        OooO0O0 oooO0O0 = new OooO0O0();
        f119049OooOo0o = oooO0O0;
        OooO00o oooO00o = new OooO00o();
        f119048OooOo = oooO00o;
        f119050OooOoO0 = new EnumC32950OooOOo0[]{oooO0O0, oooO00o};
    }

    public EnumC32950OooOOo0() {
        throw null;
    }

    public static EnumC32950OooOOo0 valueOf(String str) {
        return (EnumC32950OooOOo0) Enum.valueOf(EnumC32950OooOOo0.class, str);
    }

    public static EnumC32950OooOOo0[] values() {
        return (EnumC32950OooOOo0[]) f119050OooOoO0.clone();
    }

    public abstract String OooO00o(String str);
}
