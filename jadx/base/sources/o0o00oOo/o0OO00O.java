package o0o00oOo;

import com.orion.notein.domain.models.LabelColor;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27306OooOo00;
import o0Oo0ooO.C28422OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class o0OO00O<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f107117OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f107118OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$special$$inlined$map$1$2", m80623f = "NoteListViewModel.kt", m80624l = {56, 50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f107119OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f107120OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public InterfaceC33723OooO0oO f107122OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public C28422OooOOo f107123OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f107124OooOoo0;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f107120OooOo0o = obj;
            this.f107119OooOo |= Integer.MIN_VALUE;
            return o0OO00O.this.emit(null, this);
        }
    }

    public o0OO00O(InterfaceC33723OooO0oO interfaceC33723OooO0oO, com.orion.notein.p607ui.notelist.OooO0OO oooO0OO) {
        this.f107118OooOo0o = interfaceC33723OooO0oO;
        this.f107117OooOo = oooO0OO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        if (r6.emit(r14, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        int iIntValue;
        C28422OooOOo c28422OooOOo;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f107119OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f107119OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object objOooOOO0 = oooO00o.f107120OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f107119OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            iIntValue = ((Number) obj).intValue();
            c28422OooOOo = new C28422OooOOo(-1, -1, iIntValue == 0);
            InterfaceC27306OooOo00 interfaceC27306OooOo00 = this.f107117OooOo.f77132OooOOOo;
            interfaceC33723OooO0oO = this.f107118OooOo0o;
            oooO00o.f107122OooOoO0 = interfaceC33723OooO0oO;
            oooO00o.f107123OooOoOO = c28422OooOOo;
            oooO00o.f107124OooOoo0 = iIntValue;
            oooO00o.f107119OooOo = 1;
            objOooOOO0 = interfaceC27306OooOo00.OooOOO0();
            if (objOooOOO0 != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooOOO0);
            return C32460OooOooO.f116667OooO00o;
        }
        iIntValue = oooO00o.f107124OooOoo0;
        c28422OooOOo = oooO00o.f107123OooOoOO;
        interfaceC33723OooO0oO = oooO00o.f107122OooOoO0;
        C32446OooOOOo.OooO0O0(objOooOOO0);
        Iterable iterable = (Iterable) objOooOOO0;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
        int i3 = 0;
        for (T t : iterable) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            LabelColor labelColor = (LabelColor) t;
            arrayList.add(new C28422OooOOo(labelColor.getColorValue(), labelColor.getNameResId(), iIntValue == i4));
            i3 = i4;
        }
        ArrayList arrayListOooooOO = oOo000Oo.OooOo.OooooOO(com.facebook.soloader.OooOo.OooO0oO(c28422OooOOo), arrayList);
        oooO00o.f107122OooOoO0 = null;
        oooO00o.f107123OooOoOO = null;
        oooO00o.f107119OooOo = 2;
    }
}
