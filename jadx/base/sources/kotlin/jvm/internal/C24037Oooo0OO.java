package kotlin.jvm.internal;

import android.util.Log;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import o0O0o0O.InterfaceC25999OooO00o;
import oO0o0OOo.C33695OooO0o0;

/* JADX INFO: renamed from: kotlin.jvm.internal.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C24037Oooo0OO implements InterfaceC25999OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f80945OooO00o;

    public /* synthetic */ C24037Oooo0OO(Object obj) {
        this.f80945OooO00o = obj;
    }

    @Override // o0O0o0O.InterfaceC25999OooO00o
    public void OooO00o() {
        Log.d("NoteEditorFragment", "硬件橡皮释放事件，发送RELEASED到队列");
        ((C33695OooO0o0) this.f80945OooO00o).OooO0o0("RELEASED");
    }

    @Override // o0O0o0O.InterfaceC25999OooO00o
    public void OooO0O0() {
        Log.d("NoteEditorFragment", "硬件橡皮按下事件，发送PRESSED到队列");
        ((C33695OooO0o0) this.f80945OooO00o).OooO0o0("PRESSED");
    }

    public void OooO0OO(Object obj) {
        ((ArrayList) this.f80945OooO00o).add(obj);
    }

    public void OooO0Oo(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = (ArrayList) this.f80945OooO00o;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public C24037Oooo0OO(NumberFormat numberFormat) {
        this.f80945OooO00o = numberFormat;
        numberFormat.setGroupingUsed(false);
    }

    public C24037Oooo0OO(int i) {
        this.f80945OooO00o = new ArrayList(i);
    }
}
