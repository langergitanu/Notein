package androidx.appcompat.view.menu;

import com.aspose.slides.FontData;
import com.aspose.slides.IParagraphFormat;
import com.aspose.slides.IPortionFormat;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21505OooO0Oo {
    public static Object OooO00o(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static void OooO0O0(String str, IPortionFormat iPortionFormat, IParagraphFormat iParagraphFormat, int i, float f) {
        iPortionFormat.setComplexScriptFont(new FontData(str));
        iParagraphFormat.setAlignment(i);
        iParagraphFormat.setMarginLeft(f);
    }
}
