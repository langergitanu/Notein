package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, m80612d2 = {"<anonymous>", "", "Landroid/view/View;", "child", "invoke"}, m80613k = 3, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ViewGroupKt$descendants$1$1 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<View, Iterator<? extends View>> {
    public static final ViewGroupKt$descendants$1$1 INSTANCE = new ViewGroupKt$descendants$1$1();

    public ViewGroupKt$descendants$1$1() {
        super(1);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Iterator<View> invoke(View view) {
        InterfaceC33569OooO0oo<View> children;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null) {
            return null;
        }
        return children.iterator();
    }
}
