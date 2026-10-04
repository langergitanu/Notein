package o0o000OO;

import com.orion.notein.domain.models.page.Quote;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO<T> implements InterfaceC33723OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f105568OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC33723OooO0oO f105569OooOo0o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$annotationQuotesInNoteFlow$lambda$7$$inlined$map$1$2", m80623f = "TextAnnoViewModel.kt", m80624l = {50}, m80625m = "emit")
    public static final class OooO00o extends AbstractC32479OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f105570OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f105571OooOo0o;

        public OooO00o(Continuation continuation) {
            super(continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            this.f105571OooOo0o = obj;
            this.f105570OooOo |= Integer.MIN_VALUE;
            return OooOOOO.this.emit(null, this);
        }
    }

    public OooOOOO(InterfaceC33723OooO0oO interfaceC33723OooO0oO, String str) {
        this.f105569OooOo0o = interfaceC33723OooO0oO;
        this.f105568OooOo = str;
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
            int i = oooO00o.f105570OooOo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f105570OooOo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        }
        Object obj2 = oooO00o.f105571OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oooO00o.f105570OooOo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            ArrayList arrayList = new ArrayList();
            for (T t : (List) obj) {
                Quote quote = (Quote) t;
                if (quote.getType() == 5 || quote.getType() == 6) {
                    arrayList.add(t);
                }
            }
            C32443OooOOO c32443OooOOO = new C32443OooOOO(this.f105568OooOo, arrayList);
            oooO00o.f105570OooOo = 1;
            if (this.f105569OooOo0o.emit(c32443OooOOO, oooO00o) == enumC32485OooO00o) {
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
