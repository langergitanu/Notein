package o0Ooo0oo;

import com.google.gson.Gson;
import com.huawei.hms.network.embedded.C18416x7;
import com.orion.notein.domain.models.note.PenInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0Ooo0oo.o00000O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$removeCurrentPenFromFavorites$1", m80623f = "PenBarViewModel.kt", m80624l = {1795, 1548, 1550}, m80625m = "invokeSuspend")
public final class C29506o00000O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104641OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f104642OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f104643OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f104644OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104645OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f104646OooOoo0;

    /* JADX INFO: renamed from: o0Ooo0oo.o00000O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$removeCurrentPenFromFavorites$1$1$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104647OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104648OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ PenInfo f104649OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, PenInfo penInfo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104647OooOo = oooO0O0;
            this.f104649OooOoO0 = penInfo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f104647OooOo, this.f104649OooOoO0, continuation);
            oooO00o.f104648OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object next;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f104648OooOo0o;
            String str = (String) c24334OooO0O0.OooO0OO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75137o00oO0o);
            if (str == null) {
                str = C18416x7.f56644n;
            }
            Gson gson = this.f104647OooOo.f75150OooOOO0;
            Object objFromJson = gson.fromJson(str, (Class<Object>) PenInfo[].class);
            kotlin.jvm.internal.OooOOO0.OooO0o(objFromJson, "fromJson(...)");
            ArrayList arrayListOoooOOo = oOo000Oo.OooOOO.OoooOOo((Object[]) objFromJson);
            Iterator it = arrayListOoooOOo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (this.f104649OooOoO0.hasSamePenSettings((PenInfo) next)) {
                    break;
                }
            }
            PenInfo penInfo = (PenInfo) next;
            if (penInfo == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            arrayListOoooOOo.remove(penInfo);
            c24334OooO0O0.OooO0oO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75137o00oO0o, gson.toJson(arrayListOoooOOo));
            if (arrayListOoooOOo.isEmpty()) {
                c24334OooO0O0.OooO0oO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75139oo000o, Boolean.FALSE);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29506o00000O0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, int i, Continuation<? super C29506o00000O0> continuation) {
        super(2, continuation);
        this.f104645OooOoOO = oooO0O0;
        this.f104646OooOoo0 = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29506o00000O0(this.f104645OooOoOO, this.f104646OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29506o00000O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (o0000oOO.C24332OooO.OooO00o(r10, r6, r9) == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:27:0x006a, B:28:0x0072, B:30:0x0078, B:36:0x008a, B:39:0x0090, B:23:0x0058), top: B:47:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:27:0x006a, B:28:0x0072, B:30:0x0078, B:36:0x008a, B:39:0x0090, B:23:0x0058), top: B:47:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0089 A[SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        int i;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O02;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Iterator it;
        Object next;
        PenInfo penInfo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f104643OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                oooO0O0 = this.f104645OooOoOO;
                interfaceC33895OooO00o = oooO0O0.f75202o00o0O;
                this.f104642OooOo0o = interfaceC33895OooO00o;
                this.f104641OooOo = oooO0O0;
                i = this.f104646OooOoo0;
                this.f104644OooOoO0 = i;
                this.f104643OooOoO = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33895OooO00o2 = this.f104642OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        return C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC33895OooO00o2.OooOOO0(null);
                        throw th;
                    }
                }
                int i3 = this.f104644OooOoO0;
                oooO0O02 = this.f104641OooOo;
                InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f104642OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    i = i3;
                    interfaceC33895OooO00o = interfaceC33895OooO00o3;
                    it = ((List) obj).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((PenInfo) next).getType() == i) {
                            break;
                        }
                    }
                    penInfo = (PenInfo) next;
                    if (penInfo != null) {
                        o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = oooO0O02.f75146OooOO0;
                        OooO00o oooO00o = new OooO00o(oooO0O02, penInfo, null);
                        this.f104642OooOo0o = interfaceC33895OooO00o;
                        this.f104641OooOo = null;
                        this.f104643OooOoO = 3;
                    }
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            int i4 = this.f104644OooOoO0;
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O03 = this.f104641OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = this.f104642OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i = i4;
            interfaceC33895OooO00o = interfaceC33895OooO00o4;
            oooO0O0 = oooO0O03;
            this.f104642OooOo0o = interfaceC33895OooO00o;
            this.f104641OooOo = oooO0O0;
            this.f104644OooOoO0 = i;
            this.f104643OooOoO = 2;
            Object objOooO0o = com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.OooO0o(oooO0O0, this);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            oooO0O02 = oooO0O0;
            obj = objOooO0o;
            it = ((List) obj).iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            penInfo = (PenInfo) next;
            if (penInfo != null) {
            }
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            return C32460OooOooO.f116667OooO00o;
        } catch (Throwable th3) {
            th = th3;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
