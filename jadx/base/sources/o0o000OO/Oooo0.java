package o0o000OO;

import com.orion.notein.domain.models.page.QuoteTextAnno;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o0o000o0.C29775OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32509OooOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.textannoeditor.TextAnnoViewModel$textAnnoVOList$1", m80623f = "TextAnnoViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class Oooo0 extends AbstractC32476OooO implements InterfaceC32509OooOOo<List<? extends QuoteTextAnno>, QuoteTextAnno, String, Continuation<? super List<? extends C29775OooO00o>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ QuoteTextAnno f105637OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f105638OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f105639OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ String f105640OooOoO0;

    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((QuoteTextAnno) t).getCreationTime()), Long.valueOf(((QuoteTextAnno) t2).getCreationTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(Continuation continuation, OooOO0O oooOO0O) {
        super(4, continuation);
        this.f105639OooOoO = oooOO0O;
    }

    @Override // oO0O000o.InterfaceC32509OooOOo
    public final Object invoke(List<? extends QuoteTextAnno> list, QuoteTextAnno quoteTextAnno, String str, Continuation<? super List<? extends C29775OooO00o>> continuation) {
        Oooo0 oooo0 = new Oooo0(continuation, this.f105639OooOoO);
        oooo0.f105638OooOo0o = list;
        oooo0.f105637OooOo = quoteTextAnno;
        oooo0.f105640OooOoO0 = str;
        return oooo0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        QuoteTextAnno quoteTextAnno;
        Object next;
        int i = 1;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f105638OooOo0o;
        QuoteTextAnno quoteTextAnno2 = this.f105637OooOo;
        String str = this.f105640OooOoO0;
        if (quoteTextAnno2 == null) {
            z = true;
        } else {
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(((QuoteTextAnno) next).getId(), quoteTextAnno2.getId())) {
                        break;
                    }
                }
                quoteTextAnno = (QuoteTextAnno) next;
            } else {
                quoteTextAnno = null;
            }
            if (quoteTextAnno == null) {
                z = false;
            }
        }
        if (quoteTextAnno2 != null && z) {
            this.f105639OooOoO.OooO0oo();
        }
        C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
        if (list != null) {
            c32465OooO0O0OooO0Oo.addAll(list);
        }
        if (!z) {
            kotlin.jvm.internal.OooOOO0.OooO0Oo(quoteTextAnno2);
            c32465OooO0O0OooO0Oo.add(quoteTextAnno2);
        }
        List listO00O0O = oOo000Oo.OooOo.o00O0O(com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo), new OooO00o());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        List list2 = listO00O0O;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            QuoteTextAnno quoteTextAnno3 = (QuoteTextAnno) obj2;
            boolean z2 = (!kotlin.jvm.internal.OooOOO0.OooO0O0(quoteTextAnno2 != null ? quoteTextAnno2.getId() : null, quoteTextAnno3.getId()) || z) ? 0 : i;
            String id = quoteTextAnno3.getId();
            String username = quoteTextAnno3.getUsername();
            int type = quoteTextAnno3.getType();
            String text = quoteTextAnno3.getText();
            int i4 = i;
            List list3 = listO00O0O;
            String str2 = simpleDateFormat.format(new Long(quoteTextAnno3.getCreationTime()));
            kotlin.jvm.internal.OooOOO0.OooO0o(str2, "format(...)");
            arrayList.add(new C29775OooO00o(id, username, text, i2 == list3.size() - i4 ? i4 : 0, type, str2, z2));
            listO00O0O = list3;
            i2 = i3;
            i = i4;
        }
        return arrayList;
    }
}
