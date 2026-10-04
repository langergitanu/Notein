package o0OO00o0;

import com.orion.notein.data.p602db.entity.ItemLabelCrossRef;
import com.orion.notein.domain.models.LabelRef;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OO00o0.o00O0oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26602o00O0oOo implements InterfaceC33721OooO0o<List<? extends LabelRef>> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00O f91758OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33721OooO0o f91759OooOo0o;

    /* JADX INFO: renamed from: o0OO00o0.o00O0oOo$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ o00O f91760OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f91761OooOo0o;

        /* JADX INFO: renamed from: o0OO00o0.o00O0oOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.LabelRepoImpl$findPageLabelRefsByLabelIds$$inlined$map$1$2", m80623f = "LabelRepoImpl.kt", m80624l = {50}, m80625m = "emit")
        public static final class C19796OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f91762OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f91763OooOo0o;

            public C19796OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f91763OooOo0o = obj;
                this.f91762OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, o00O o00o2) {
            this.f91761OooOo0o = interfaceC33723OooO0oO;
            this.f91760OooOo = o00o2;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C19796OooO00o c19796OooO00o;
            if (continuation instanceof C19796OooO00o) {
                c19796OooO00o = (C19796OooO00o) continuation;
                int i = c19796OooO00o.f91762OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c19796OooO00o.f91762OooOo = i - Integer.MIN_VALUE;
                } else {
                    c19796OooO00o = new C19796OooO00o(continuation);
                }
            }
            Object obj2 = c19796OooO00o.f91763OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c19796OooO00o.f91762OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f91760OooOo.f91624OooO0OO.toModel((ItemLabelCrossRef) it.next()));
                }
                c19796OooO00o.f91762OooOo = 1;
                if (this.f91761OooOo0o.emit(arrayList, c19796OooO00o) == enumC32485OooO00o) {
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

    public C26602o00O0oOo(InterfaceC33721OooO0o interfaceC33721OooO0o, o00O o00o2) {
        this.f91759OooOo0o = interfaceC33721OooO0o;
        this.f91758OooOo = o00o2;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super List<? extends LabelRef>> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f91759OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f91758OooOo), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
