package o0OO;

import com.orion.notein.data.p602db.entity.NoteFileEntity;
import com.orion.notein.domain.mapper.NoteFileMapper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0Oo.InterfaceC27311OooOoOO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oo0oO0.InterfaceC34927o00oOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOo00 implements InterfaceC27311OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34927o00oOOo f90696OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final NoteFileMapper f90697OooO0O0;

    public OooOo00(InterfaceC34927o00oOOo noteFileDao, NoteFileMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(noteFileDao, "noteFileDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f90696OooO00o = noteFileDao;
        this.f90697OooO0O0 = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o0OOo0Oo.InterfaceC27311OooOoOO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO00o(EnumC27285OooO enumC27285OooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26413OooOOoo c26413OooOOoo;
        OooOo00 oooOo00;
        if (abstractC32479OooO0OO instanceof C26413OooOOoo) {
            c26413OooOOoo = (C26413OooOOoo) abstractC32479OooO0OO;
            int i = c26413OooOOoo.f90686OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26413OooOOoo.f90686OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26413OooOOoo = new C26413OooOOoo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c26413OooOOoo.f90684OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26413OooOOoo.f90686OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            int iOrdinal = enumC27285OooO.ordinal();
            Integer num = null;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    num = 0;
                } else if (iOrdinal == 2) {
                    num = 1;
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new C32442OooOO0o();
                    }
                    num = 0;
                }
            }
            if (num == null) {
                return C34434OooOoO.f123453OooOo0o;
            }
            int iIntValue = num.intValue();
            c26413OooOOoo.f90685OooOo0o = this;
            c26413OooOOoo.f90686OooOoO = 1;
            objOooO00o = this.f90696OooO00o.OooO00o(iIntValue, c26413OooOOoo);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooOo00 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOo00 = c26413OooOOoo.f90685OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
        }
        Iterable iterable = (Iterable) objOooO00o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(oooOo00.f90697OooO0O0.toNoteFile((NoteFileEntity) it.next()));
        }
        return arrayList;
    }
}
