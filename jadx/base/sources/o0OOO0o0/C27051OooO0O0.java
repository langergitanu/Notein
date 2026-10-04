package o0OOO0o0;

import android.util.Size;
import com.orion.notein.data.p602db.entity.cache.PdfTextCacheEntity;
import com.orion.notein.domain.mapper.PdfTextCacheMapper;
import com.orion.notein.domain.models.cache.PdfTextCache;
import com.orion.notein.domain.models.note.PdfInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o00Oo0oO.C25051OooO0OO;
import o0OOo0Oo.InterfaceC27320Oooo0OO;
import o0OOo0o.C27575o00oo000;
import o0Oo00o0.C28032OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import oo0oO0.InterfaceC34937o00oOoOo;

/* JADX INFO: renamed from: o0OOO0o0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27051OooO0O0 implements InterfaceC27320Oooo0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27052OooO0OO f94185OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25051OooO0OO f94186OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PdfTextCacheMapper f94187OooO0OO;

    public C27051OooO0O0(C27052OooO0OO c27052OooO0OO, C25051OooO0OO c25051OooO0OO, PdfTextCacheMapper mapper) {
        OooOOO0.OooO0oO(mapper, "mapper");
        this.f94185OooO00o = c27052OooO0OO;
        this.f94186OooO0O0 = c25051OooO0OO;
        this.f94187OooO0OO = mapper;
    }

    @Override // o0OOo0Oo.InterfaceC27320Oooo0OO
    public final Object OooO00o(String str, int i, C28032OooO0O0 c28032OooO0O0) {
        return ((InterfaceC34937o00oOoOo) this.f94186OooO0O0.f85053OooO00o).OooO00o(str, i, c28032OooO0O0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27320Oooo0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(int i, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27050OooO00o c27050OooO00o;
        C27051OooO0O0 c27051OooO0O0;
        if (abstractC32479OooO0OO instanceof C27050OooO00o) {
            c27050OooO00o = (C27050OooO00o) abstractC32479OooO0OO;
            int i2 = c27050OooO00o.f94183OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27050OooO00o.f94183OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c27050OooO00o = new C27050OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c27050OooO00o.f94181OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27050OooO00o.f94183OooOoO;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0OO);
                C25051OooO0OO c25051OooO0OO = this.f94186OooO0O0;
                c27050OooO00o.f94182OooOo0o = this;
                c27050OooO00o.f94183OooOoO = 1;
                objOooO0OO = ((InterfaceC34937o00oOoOo) c25051OooO0OO.f85053OooO00o).OooO0OO(str, i, c27050OooO00o);
                if (objOooO0OO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                c27051OooO0O0 = this;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c27051OooO0O0 = c27050OooO00o.f94182OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0OO);
            }
            PdfTextCacheEntity pdfTextCacheEntity = (PdfTextCacheEntity) objOooO0OO;
            if (pdfTextCacheEntity == null) {
                return null;
            }
            try {
                return c27051OooO0O0.f94187OooO0OO.toModel(pdfTextCacheEntity);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            C34406OooO00o.f123390OooO00o.OooO0OO("PdfTextRepoImpl", "getPdfTextCacheSync: " + e2);
            return null;
        }
    }

    @Override // o0OOo0Oo.InterfaceC27320Oooo0OO
    public final Object OooO0OO(PdfTextCache pdfTextCache, C27575o00oo000 c27575o00oo000) {
        Object objOooO0O0 = ((InterfaceC34937o00oOoOo) this.f94186OooO0O0.f85053OooO00o).OooO0O0(new PdfTextCacheEntity[]{this.f94187OooO0OO.toEntity(pdfTextCache)}, c27575o00oo000);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0O0 != enumC32485OooO00o) {
            objOooO0O0 = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0O0 == enumC32485OooO00o ? objOooO0O0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OOo0Oo.InterfaceC27320Oooo0OO
    public final ArrayList OooO0Oo(PdfInfo pdfInfo, int i, Size size) {
        try {
            return this.f94185OooO00o.OooO0O0(pdfInfo, i, size);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PdfTextRepoImpl");
            c20358OooO00o.OooO0Oo(e, "recognizeText err", new Object[0]);
            return null;
        }
    }
}
