package o0OOO0Oo;

import com.orion.notein.data.p602db.entity.PageLayerEntity;
import com.orion.notein.domain.models.page.PageLayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33734OooOOoo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOO0Oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27043OooOOoo implements InterfaceC33721OooO0o<List<? extends PageLayer>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27044OooOo0 f94162OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33734OooOOoo f94163OooOo0o;

    /* JADX INFO: renamed from: o0OOO0Oo.OooOOoo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C27044OooOo0 f94164OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f94165OooOo0o;

        /* JADX INFO: renamed from: o0OOO0Oo.OooOOoo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.page.layer.PageLayerRepoImpl$getPageLayersByNoteId$$inlined$map$1$2", m80623f = "PageLayerRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19840OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f94166OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f94167OooOo0o;

            public C19840OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f94167OooOo0o = obj;
                this.f94166OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, C27044OooOo0 c27044OooOo0) {
            this.f94165OooOo0o = interfaceC33723OooO0oO;
            this.f94164OooOo = c27044OooOo0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19840OooO00o c19840OooO00o;
            if (continuation instanceof C19840OooO00o) {
                c19840OooO00o = (C19840OooO00o) continuation;
                int i = c19840OooO00o.f94166OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19840OooO00o.f94166OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19840OooO00o = new C19840OooO00o(continuation);
                }
            }
            Object obj2 = c19840OooO00o.f94167OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19840OooO00o.f94166OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f94164OooOo.f94170OooO0O0.toPageLayer((PageLayerEntity) it.next()));
                }
                c19840OooO00o.f94166OooOo = 1;
                if (this.f94165OooOo0o.emit(arrayList, c19840OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C27043OooOOoo(C33734OooOOoo c33734OooOOoo, C27044OooOo0 c27044OooOo0) {
        this.f94163OooOo0o = c33734OooOOoo;
        this.f94162OooOo = c27044OooOo0;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends PageLayer>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f94163OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f94162OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
