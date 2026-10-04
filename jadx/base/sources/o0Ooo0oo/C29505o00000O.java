package o0Ooo0oo;

import com.google.gson.Gson;
import com.huawei.hms.network.embedded.C18416x7;
import com.orion.notein.domain.models.note.PenInfo;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0Ooo0oo.o00000O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$removeFavoritePen$1", m80623f = "PenBarViewModel.kt", m80624l = {1795, 1570}, m80625m = "invokeSuspend")
public final class C29505o00000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104632OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f104633OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f104634OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public FavoritePenVO f104635OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104636OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ FavoritePenVO f104637OooOoo0;

    /* JADX INFO: renamed from: o0Ooo0oo.o00000O$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$removeFavoritePen$1$1$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104638OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104639OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ FavoritePenVO f104640OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, FavoritePenVO favoritePenVO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104638OooOo = oooO0O0;
            this.f104640OooOoO0 = favoritePenVO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f104638OooOo, this.f104640OooOoO0, continuation);
            oooO00o.f104639OooOo0o = obj;
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
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f104639OooOo0o;
            String str = (String) c24334OooO0O0.OooO0OO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75137o00oO0o);
            if (str == null) {
                str = C18416x7.f56644n;
            }
            Gson gson = this.f104638OooOo.f75150OooOOO0;
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
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((PenInfo) next).getId(), this.f104640OooOoO0.getId())) {
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
    public C29505o00000O(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, FavoritePenVO favoritePenVO, Continuation<? super C29505o00000O> continuation) {
        super(2, continuation);
        this.f104636OooOoOO = oooO0O0;
        this.f104637OooOoo0 = favoritePenVO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29505o00000O(this.f104636OooOoOO, this.f104637OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29505o00000O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        FavoritePenVO favoritePenVO;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104634OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O02 = this.f104636OooOoOO;
                interfaceC33895OooO00o = oooO0O02.f75202o00o0O;
                this.f104633OooOo0o = interfaceC33895OooO00o;
                this.f104632OooOo = oooO0O02;
                favoritePenVO = this.f104637OooOoo0;
                this.f104635OooOoO0 = favoritePenVO;
                this.f104634OooOoO = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                    oooO0O0 = oooO0O02;
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = this.f104633OooOo0o;
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
            FavoritePenVO favoritePenVO2 = this.f104635OooOoO0;
            oooO0O0 = this.f104632OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f104633OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            favoritePenVO = favoritePenVO2;
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = oooO0O0.f75146OooOO0;
            OooO00o oooO00o = new OooO00o(oooO0O0, favoritePenVO, null);
            this.f104633OooOo0o = interfaceC33895OooO00o;
            this.f104632OooOo = null;
            this.f104635OooOoO0 = null;
            this.f104634OooOoO = 2;
            if (C24332OooO.OooO00o(oooOO02, oooO00o, this) != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } catch (Throwable th2) {
            th = th2;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
