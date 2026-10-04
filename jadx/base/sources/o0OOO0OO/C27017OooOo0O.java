package o0OOO0OO;

import com.orion.notein.domain.models.page.PageClipDataV2;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;

/* JADX INFO: renamed from: o0OOO0OO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27017OooOo0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public PageClipDataV2 f94053OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33898OooO0Oo f94052OooO00o = C33900OooO0o0.OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33781o00o0O f94054OooO0OO = C33784o00ooo.OooO00o(Boolean.FALSE);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        OooOo00 oooOo00;
        C27017OooOo0O c27017OooOo0O;
        C33898OooO0Oo c33898OooO0Oo;
        if (abstractC32479OooO0OO instanceof OooOo00) {
            oooOo00 = (OooOo00) abstractC32479OooO0OO;
            int i = oooOo00.f94051OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f94051OooOoOO = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oooOo00.f94050OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooOo00.f94051OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            oooOo00.f94048OooOo0o = this;
            C33898OooO0Oo c33898OooO0Oo2 = this.f94052OooO00o;
            oooOo00.f94047OooOo = c33898OooO0Oo2;
            oooOo00.f94051OooOoOO = 1;
            if (c33898OooO0Oo2.OooO00o(oooOo00) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27017OooOo0O = this;
            c33898OooO0Oo = c33898OooO0Oo2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33898OooO0Oo = oooOo00.f94047OooOo;
            c27017OooOo0O = oooOo00.f94048OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        try {
            PageClipDataV2 pageClipDataV2 = c27017OooOo0O.f94053OooO0O0;
            return pageClipDataV2 != null ? PageClipDataV2.copy$default(pageClipDataV2, null, null, false, 7, null) : null;
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(PageClipDataV2 pageClipDataV2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27016OooOo0 c27016OooOo0;
        C33898OooO0Oo c33898OooO0Oo;
        C27017OooOo0O c27017OooOo0O;
        if (abstractC32479OooO0OO instanceof C27016OooOo0) {
            c27016OooOo0 = (C27016OooOo0) abstractC32479OooO0OO;
            int i = c27016OooOo0.f94046OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27016OooOo0.f94046OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27016OooOo0 = new C27016OooOo0(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27016OooOo0.f94043OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27016OooOo0.f94046OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27016OooOo0.f94042OooOo0o = this;
            c27016OooOo0.f94041OooOo = pageClipDataV2;
            c33898OooO0Oo = this.f94052OooO00o;
            c27016OooOo0.f94044OooOoO0 = c33898OooO0Oo;
            c27016OooOo0.f94046OooOoo0 = 1;
            if (c33898OooO0Oo.OooO00o(c27016OooOo0) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c27017OooOo0O = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C33898OooO0Oo c33898OooO0Oo2 = c27016OooOo0.f94044OooOoO0;
            PageClipDataV2 pageClipDataV22 = c27016OooOo0.f94041OooOo;
            c27017OooOo0O = c27016OooOo0.f94042OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c33898OooO0Oo = c33898OooO0Oo2;
            pageClipDataV2 = pageClipDataV22;
        }
        try {
            c27017OooOo0O.f94053OooO0O0 = pageClipDataV2;
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            Boolean boolValueOf = Boolean.valueOf(pageClipDataV2 != null);
            C33781o00o0O c33781o00o0O = c27017OooOo0O.f94054OooO0OO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, boolValueOf);
            return C32460OooOooO.f116667OooO00o;
        } finally {
            c33898OooO0Oo.OooOOO0(null);
        }
    }
}
