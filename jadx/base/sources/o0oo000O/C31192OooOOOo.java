package o0oo000O;

import OooooO0.C21289OooO0o;
import android.graphics.Point;
import android.graphics.RectF;
import com.orion.notein.domain.models.page.INoteinDisplayItem;
import com.orion.notein.domain.models.page.LayeredDisplayItems;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageGrid;
import com.orion.notein.domain.models.page.PaperSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: o0oo000O.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31192OooOOOo {
    public static RectF OooO00o(RectF displayItemBounds, Float f) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItemBounds, "displayItemBounds");
        float fFloatValue = f != null ? f.floatValue() : PaperSpec.INSTANCE.getUNBOUNDED().getWidth() * 0.5f;
        RectF rectF = new RectF(displayItemBounds);
        if (rectF.width() > 0.0f) {
            rectF.left -= fFloatValue;
            rectF.right += fFloatValue;
        }
        if (rectF.height() > 0.0f) {
            rectF.top -= fFloatValue;
            rectF.bottom += fFloatValue;
        }
        if (f != null && !rectF.isEmpty()) {
            return rectF;
        }
        PaperSpec.Companion companion = PaperSpec.INSTANCE;
        RectF rectF2 = new RectF(0.0f, 0.0f, companion.getUNBOUNDED().getWidth(), companion.getUNBOUNDED().getHeight());
        rectF2.union(rectF);
        return rectF2;
    }

    public static RectF OooO0O0(Page page, Float f) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        if (!page.getUnbounded()) {
            throw new IllegalArgumentException("page is not unbounded");
        }
        RectF rectF = new RectF();
        List<LayeredDisplayItems> displayItemsIfSet = page.getDisplayItemsIfSet();
        if (displayItemsIfSet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = displayItemsIfSet.iterator();
            while (it.hasNext()) {
                C34431OooOo0.OooOo0o(arrayList, ((LayeredDisplayItems) it.next()).getItems());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                rectF.union(((INoteinDisplayItem) it2.next()).getBoundingBox(1.0f));
            }
        }
        return OooO00o(rectF, f);
    }

    public static ArrayList OooO0OO(String pageId, RectF bounds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bounds, "bounds");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
        PaperSpec.Companion companion = PaperSpec.INSTANCE;
        float width = companion.getUNBOUNDED().getWidth();
        float height = companion.getUNBOUNDED().getHeight();
        int iOooO0o0 = C21289OooO0o.OooO0o0(bounds.left / width);
        int iOooO0o02 = C21289OooO0o.OooO0o0(bounds.top / height);
        int iOooO0O0 = C21289OooO0o.OooO0O0(bounds.right / width);
        int iOooO0O02 = C21289OooO0o.OooO0O0(bounds.bottom / height);
        ArrayList arrayList = new ArrayList();
        if (iOooO0o0 <= iOooO0O0) {
            while (true) {
                if (iOooO0o02 <= iOooO0O02) {
                    int i = iOooO0o02;
                    while (true) {
                        int i2 = i + 1;
                        arrayList.add(new PageGrid(pageId, new RectF(iOooO0o0 * width, i * height, (iOooO0o0 + 1) * width, i2 * height), new Point(iOooO0o0, i)));
                        if (i == iOooO0O02) {
                            break;
                        }
                        i = i2;
                    }
                }
                if (iOooO0o0 == iOooO0O0) {
                    break;
                }
                iOooO0o0++;
            }
        }
        return arrayList;
    }
}
