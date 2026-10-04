package ooOOO0Oo;

import kotlin.jvm.internal.C24035Oooo00o;
import oO00ooO.C32431OooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OooO0.C33477OooO0OO;
import oOoo0.InterfaceC34596OooO0o;
import ooOOO0Oo.InterfaceC35049OooOooO;

/* JADX INFO: renamed from: ooOOO0Oo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35043OooOo0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C35043OooOo0o f125821OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C35044OooOoO f125822OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f125823OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f125824OooO0OO;

    /* JADX INFO: renamed from: ooOOO0Oo.OooOo0o$OooO00o */
    public /* synthetic */ class OooO00o extends kotlin.jvm.internal.OooOO0O implements InterfaceC32507OooOO0o<C33477OooO0OO, Oooo000> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f125825OooOo0o = new OooO00o(1);

        @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo, oOoo0.InterfaceC34594OooO0OO
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
        public final InterfaceC34596OooO0o getOwner() {
            return C24035Oooo00o.f80943OooO00o.OooO0OO(C35041OooOo0.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Oooo000 invoke(C33477OooO0OO c33477OooO0OO) {
            C33477OooO0OO p0 = c33477OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(p0, "p0");
            C33477OooO0OO c33477OooO0OO2 = C35041OooOo0.f125813OooO00o;
            InterfaceC35049OooOooO.f125867OooO00o.getClass();
            C35050OooOooo configuredReportLevels = InterfaceC35049OooOooO.OooO00o.f125869OooO0O0;
            C32431OooO c32431OooO = new C32431OooO(1, 7, 20);
            kotlin.jvm.internal.OooOOO0.OooO0oO(configuredReportLevels, "configuredReportLevels");
            Oooo000 oooo000 = (Oooo000) configuredReportLevels.f125871OooO0OO.invoke(p0);
            if (oooo000 != null) {
                return oooo000;
            }
            C35050OooOooo c35050OooOooo = C35041OooOo0.f125815OooO0OO;
            c35050OooOooo.getClass();
            C35042OooOo0O c35042OooOo0O = (C35042OooOo0O) c35050OooOooo.f125871OooO0OO.invoke(p0);
            if (c35042OooOo0O == null) {
                return Oooo000.IGNORE;
            }
            C32431OooO c32431OooO2 = c35042OooOo0O.f125819OooO0O0;
            return (c32431OooO2 == null || c32431OooO2.f116625OooOoO - c32431OooO.f116625OooOoO > 0) ? c35042OooOo0O.f125818OooO00o : c35042OooOo0O.f125820OooO0OO;
        }
    }

    static {
        C33477OooO0OO c33477OooO0OO = C35041OooOo0.f125813OooO00o;
        C32431OooO configuredKotlinVersion = C32431OooO.f116622OooOoOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(configuredKotlinVersion, "configuredKotlinVersion");
        C35042OooOo0O c35042OooOo0O = C35041OooOo0.f125816OooO0Oo;
        C32431OooO c32431OooO = c35042OooOo0O.f125819OooO0O0;
        Oooo000 globalReportLevel = (c32431OooO == null || c32431OooO.f116625OooOoO - configuredKotlinVersion.f116625OooOoO > 0) ? c35042OooOo0O.f125818OooO00o : c35042OooOo0O.f125820OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(globalReportLevel, "globalReportLevel");
        f125821OooO0Oo = new C35043OooOo0o(new C35044OooOoO(globalReportLevel, globalReportLevel == Oooo000.WARN ? null : globalReportLevel), OooO00o.f125825OooOo0o);
    }

    public C35043OooOo0o(C35044OooOoO c35044OooOoO, OooO00o getReportLevelForAnnotation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f125822OooO00o = c35044OooOoO;
        this.f125823OooO0O0 = getReportLevelForAnnotation;
        this.f125824OooO0OO = c35044OooOoO.f125829OooO0Oo || getReportLevelForAnnotation.invoke(C35041OooOo0.f125813OooO00o) == Oooo000.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f125822OooO00o + ", getReportLevelForAnnotation=" + this.f125823OooO0O0 + ')';
    }
}
