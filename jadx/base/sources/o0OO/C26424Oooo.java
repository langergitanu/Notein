package o0OO;

import com.orion.notein.data.p602db.entity.PenInfoEntity;
import com.orion.notein.domain.mapper.PenInfoMapper;
import com.orion.notein.domain.models.note.PenInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oOo000Oo.C34428OooOOo;
import oo0oO0.InterfaceC34947o00oo0O0;

/* JADX INFO: renamed from: o0OO.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26424Oooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34947o00oo0O0 f90732OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final PenInfoMapper f90733OooO0O0;

    /* JADX INFO: renamed from: o0OO.Oooo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.note.PenInfoLocalDBDataSource", m80623f = "PenInfoLocalDBDataSource.kt", m80624l = {32}, m80625m = "savePenInfo")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f90735OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f90736OooOoO0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f90735OooOo0o = obj;
            this.f90736OooOoO0 |= Integer.MIN_VALUE;
            return C26424Oooo.this.OooO0O0(null, this);
        }
    }

    public C26424Oooo(InterfaceC34947o00oo0O0 penInfoDao, PenInfoMapper mapper) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(penInfoDao, "penInfoDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(mapper, "mapper");
        this.f90732OooO00o = penInfoDao;
        this.f90733OooO0O0 = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OooO00o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C26432Oooo0oo c26432Oooo0oo;
        C26424Oooo c26424Oooo;
        if (abstractC32479OooO0OO instanceof C26432Oooo0oo) {
            c26432Oooo0oo = (C26432Oooo0oo) abstractC32479OooO0OO;
            int i = c26432Oooo0oo.f90778OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c26432Oooo0oo.f90778OooOoO = i - Integer.MIN_VALUE;
            } else {
                c26432Oooo0oo = new C26432Oooo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0OO = c26432Oooo0oo.f90776OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c26432Oooo0oo.f90778OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0OO);
            c26432Oooo0oo.f90777OooOo0o = this;
            c26432Oooo0oo.f90778OooOoO = 1;
            objOooO0OO = this.f90732OooO00o.OooO0OO(str, c26432Oooo0oo);
            if (objOooO0OO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c26424Oooo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26424Oooo = c26432Oooo0oo.f90777OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0OO);
        }
        Iterable iterable = (Iterable) objOooO0OO;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(c26424Oooo.f90733OooO0O0.toPenInfo((PenInfoEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(PenInfo[] penInfoArr, Continuation<? super C32460OooOooO> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f90736OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f90736OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj = oooO00o.f90735OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f90736OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = new ArrayList(penInfoArr.length);
            for (PenInfo penInfo : penInfoArr) {
                arrayList.add(this.f90733OooO0O0.toEntity(penInfo));
            }
            PenInfoEntity[] penInfoEntityArr = (PenInfoEntity[]) arrayList.toArray(new PenInfoEntity[0]);
            PenInfoEntity[] penInfoEntityArr2 = (PenInfoEntity[]) Arrays.copyOf(penInfoEntityArr, penInfoEntityArr.length);
            oooO00o.f90736OooOoO0 = 1;
            if (this.f90732OooO00o.OooO00o(penInfoEntityArr2, oooO00o) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
