package o0oo0o;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.orion.penkit.models.DrawRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24761OooO;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0oo0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC31284OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f111702OooO0O0 = OooO00o.f111703OooO00o;

    /* JADX INFO: renamed from: o0oo0o.OooO0O0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f111703OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final DrawRecord f111704OooO0O0 = new DrawRecord(C24761OooO.OooO00o("toString(...)"), -1, ViewCompat.MEASURED_STATE_MASK, 0.0f, new ArrayList(), new RectF(), "", 0, false, null, false, 1920, null);

        public static RectF OooO00o(float f, List list) {
            OooOOO0.OooO0oO(list, "list");
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC31284OooO0O0) it.next()).getBoundingBox(f));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                RectF rectF = (RectF) next;
                rectF.union((RectF) it2.next());
                next = rectF;
            }
            return (RectF) next;
        }

        public static RectF OooO0O0(float f, List list) {
            OooOOO0.OooO0oO(list, "list");
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC31284OooO0O0) it.next()).getBoundingBoxWithoutOffset(f));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList == null) {
                return null;
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                RectF rectF = (RectF) next;
                rectF.union((RectF) it2.next());
                next = rectF;
            }
            return (RectF) next;
        }
    }

    InterfaceC31284OooO0O0 deepCopy(String str);

    InterfaceC31284OooO0O0 deepCopy(String str, RectF rectF);

    InterfaceC31284OooO0O0 deepCopy(String str, String str2);

    InterfaceC31284OooO0O0 deepCopy(String str, String str2, long j);

    boolean doesSupportLayer();

    RectF getBoundingBox(float f);

    RectF getBoundingBoxWithoutOffset(float f);

    long getCreationTime();

    String getId();

    int getItemType();

    String getLayerId();

    void offset(float f, float f2);

    C32443OooOOO<Set<InterfaceC31284OooO0O0>, Set<InterfaceC31284OooO0O0>> onEraserEvent(PointF pointF, PointF pointF2, PointF pointF3, float f, boolean z, float f2);

    boolean onLassoEvent(List<? extends PointF> list);

    <T> void render(o0O0oo00.OooO00o<T> oooO00o, o0O0oo00.OooO0O0<T> oooO0O0, float f);

    void rotate(float f, PointF pointF);

    void scale(float f, boolean z);
}
