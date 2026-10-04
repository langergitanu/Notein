package o0oOo0Oo;

import com.orion.notein.domain.models.message.NoteinMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o0o0OOO.C30510OoooOoo;
import o0oOoOo.C31057OooOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0oOo0Oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30970OooO0o<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f110657OooOo0o;

    /* JADX INFO: renamed from: o0oOo0Oo.OooO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.message.UserMessageViewModel$special$$inlined$map$1$2", m80623f = "UserMessageViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f110658OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f110659OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f110659OooOo0o = obj;
            this.f110658OooOo |= Integer.MIN_VALUE;
            return C30970OooO0o.this.emit(null, this);
        }
    }

    public C30970OooO0o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
        this.f110657OooOo0o = interfaceC33723OooO0oO;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oO0o0Oo.InterfaceC33723OooO0oO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f110658OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f110658OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f110659OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f110658OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            List<NoteinMessage> list = (List) obj;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (NoteinMessage noteinMessage : list) {
                String id = noteinMessage.getId();
                String uid = noteinMessage.getUid();
                Map<String, String> title = noteinMessage.getTitle();
                Map<String, String> content = noteinMessage.getContent();
                Long creationTimeMillis = noteinMessage.getCreationTimeMillis();
                arrayList.add(new C31057OooOoo0(id, uid, title, content, creationTimeMillis != null ? creationTimeMillis.longValue() : System.currentTimeMillis()));
            }
            List listO00O0O = OooOo.o00O0O(arrayList, new C30510OoooOoo(1));
            oooO00o.f110658OooOo = 1;
            if (this.f110657OooOo0o.emit(listO00O0O, oooO00o) == enumC32485OooO00o) {
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
