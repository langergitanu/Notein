package o0OO0oO;

import com.aspose.words.StyleIdentifier;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OOo.C33711OooOo00;
import oO0o0OOo.InterfaceC33712OooOo0O;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0OO0oO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.doc.AsposeRemoteDataSource$getConvertProgress$1", m80623f = "AsposeRemoteDataSource.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_5}, m80625m = "invokeSuspend")
public final class C26931OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33712OooOo0O<? super Map<String, ? extends Integer>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f93533OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f93534OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f93535OooOoO0;

    /* JADX INFO: renamed from: o0OO0oO.OooO0o0$OooO00o */
    public static final class OooO00o implements InterfaceC26934OooOO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33712OooOo0O<Map<String, Integer>> f93536OooO00o;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(InterfaceC33712OooOo0O<? super Map<String, Integer>> interfaceC33712OooOo0O) {
            this.f93536OooO00o = interfaceC33712OooOo0O;
        }

        @Override // o0OO0oO.InterfaceC26934OooOO0o
        public final void OooO00o(ConcurrentHashMap idToProgressMap) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(idToProgressMap, "idToProgressMap");
            this.f93536OooO00o.OooO0o0(C34444Oooo0O0.OooOOO0(idToProgressMap));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26931OooO0o0(OooO0o oooO0o, Continuation<? super C26931OooO0o0> continuation) {
        super(2, continuation);
        this.f93535OooOoO0 = oooO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26931OooO0o0 c26931OooO0o0 = new C26931OooO0o0(this.f93535OooOoO0, continuation);
        c26931OooO0o0.f93533OooOo = obj;
        return c26931OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33712OooOo0O<? super Map<String, ? extends Integer>> interfaceC33712OooOo0O, Continuation<? super C32460OooOooO> continuation) {
        return ((C26931OooO0o0) create(interfaceC33712OooOo0O, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f93534OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33712OooOo0O interfaceC33712OooOo0O = (InterfaceC33712OooOo0O) this.f93533OooOo;
            interfaceC33712OooOo0O.OooO0o0(C34436OooOoOO.f123455OooOo0o);
            final OooO00o oooO00o = new OooO00o(interfaceC33712OooOo0O);
            final OooO0o oooO0o = this.f93535OooOoO0;
            oooO0o.f93529OooO0OO.add(oooO00o);
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o() { // from class: o0OO0oO.OooO0Oo
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    oooO0o.f93529OooO0OO.remove(oooO00o);
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("AsposeRemoteDataSource");
                    c20358OooO00o.OooO0OO("notify convert progress error!", new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
            };
            this.f93534OooOo0o = 1;
            if (C33711OooOo00.OooO00o(interfaceC33712OooOo0O, oooO00o2, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
