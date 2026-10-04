package androidx.compose.material.ripple;

import Oooo0OO.C20959OooOOO0;
import android.content.Context;
import android.view.ViewGroup;
import com.orion.notein.global.R;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "material-ripple_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class RippleContainer extends ViewGroup {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f63313OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f63314OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C20959OooOOO0 f63315OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final ArrayList f63316OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f63317OooOoOO;

    public RippleContainer(Context context) {
        super(context);
        this.f63314OooOo0o = 5;
        ArrayList arrayList = new ArrayList();
        this.f63313OooOo = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f63316OooOoO0 = arrayList2;
        this.f63315OooOoO = new C20959OooOOO0();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f63317OooOoOO = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
