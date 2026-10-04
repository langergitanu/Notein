package com.orion.notein.p607ui.noteeditor.toolbox.favorite;

import OooOooo.C20785Oooo00o;
import Oooo0.o000000O;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C22041OooOOo;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo000;
import o0O0OooO.C25907OooO00o;
import o0Oo00oO.C28036OooO0O0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oOo.ViewOnClickListenerC28305OooO;
import o0OoOOo0.ViewOnClickListenerC29184OooO0Oo;
import o0o000O.ViewOnTouchListenerC29732OooO00o;
import o0o00o00.C29938OooO00o;
import o0o00o00.C29943OooO0oO;
import o0o00o00.C29944OooO0oo;
import o0o00o00.RunnableC29941OooO0Oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/toolbox/favorite/FavoriteToolBox;", "Landroidx/cardview/widget/CardView;", "", "getMinX", "()F", "getMinY", "Lcom/orion/notein/ui/noteeditor/toolbox/favorite/FavoriteToolBox$OooO0O0;", "OooOo0o", "Lcom/orion/notein/ui/noteeditor/toolbox/favorite/FavoriteToolBox$OooO0O0;", "getToolBoxListener", "()Lcom/orion/notein/ui/noteeditor/toolbox/favorite/FavoriteToolBox$OooO0O0;", "setToolBoxListener", "(Lcom/orion/notein/ui/noteeditor/toolbox/favorite/FavoriteToolBox$OooO0O0;)V", "toolBoxListener", "OooO0O0", "OooO0OO", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FavoriteToolBox extends CardView {

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final /* synthetic */ int f76887Oooo0OO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public RecyclerView f76888OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public OooO0O0 toolBoxListener;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public View f76890OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C29938OooO00o f76891OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f76892OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f76893OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f76894OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f76895OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public OooO0OO f76896OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C25907OooO00o f76897Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Handler f76898Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final AtomicBoolean f76899Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C25907OooO00o f76900Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final androidx.core.widget.OooO00o f76901Oooo0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f76902OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f76903OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Float f76904OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Float f76905OooO0Oo;

        public OooO00o(boolean z, int i, Float f, Float f2) {
            this.f76902OooO00o = z;
            this.f76903OooO0O0 = i;
            this.f76904OooO0OO = f;
            this.f76905OooO0Oo = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f76902OooO00o == oooO00o.f76902OooO00o && this.f76903OooO0O0 == oooO00o.f76903OooO0O0 && OooOOO0.OooO0O0(this.f76904OooO0OO, oooO00o.f76904OooO0OO) && OooOOO0.OooO0O0(this.f76905OooO0Oo, oooO00o.f76905OooO0Oo);
        }

        public final int hashCode() {
            int iOooO00o = C20785Oooo00o.OooO00o(this.f76903OooO0O0, Boolean.hashCode(this.f76902OooO00o) * 31, 31);
            Float f = this.f76904OooO0OO;
            int iHashCode = (iOooO00o + (f == null ? 0 : f.hashCode())) * 31;
            Float f2 = this.f76905OooO0Oo;
            return iHashCode + (f2 != null ? f2.hashCode() : 0);
        }

        public final String toString() {
            return "Metadata(isVisible=" + this.f76902OooO00o + ", orientation=" + this.f76903OooO0O0 + ", verticalBias=" + this.f76904OooO0OO + ", horizontalBias=" + this.f76905OooO0Oo + ")";
        }
    }

    public interface OooO0O0 {
        void OooO00o(FavoritePenVO favoritePenVO);

        void OooO0O0(FavoritePenVO favoritePenVO);

        void OooO0OO(int i);

        void OooO0Oo(ArrayList arrayList);

        void OooO0o();

        void OooO0o0(float f, float f2);
    }

    public final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f76906OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ObjectAnimator f76907OooO0O0;

        public OooO0OO(int i, ObjectAnimator objectAnimator) {
            this.f76906OooO00o = i;
            this.f76907OooO0O0 = objectAnimator;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.toolbox.favorite.FavoriteToolBox$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23614OooO0Oo implements OooO00o.InterfaceC19367OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public List<FavoritePenVO> f76908OooO00o;

        public C23614OooO0Oo() {
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void OooO00o() {
            FavoriteToolBox favoriteToolBox = FavoriteToolBox.this;
            View view = favoriteToolBox.f76892OooOoOO;
            if (view == null) {
                OooOOO0.OooOOOO("btnBottom");
                throw null;
            }
            if (view.isActivated()) {
                return;
            }
            favoriteToolBox.OooO0OO(true);
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void OooO0O0() {
            OooO0O0 toolBoxListener;
            List<FavoritePenVO> list = this.f76908OooO00o;
            if (list != null && (toolBoxListener = FavoriteToolBox.this.getToolBoxListener()) != null) {
                List<FavoritePenVO> list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FavoritePenVO) it.next()).getId());
                }
                toolBoxListener.OooO0Oo(arrayList);
            }
            this.f76908OooO00o = null;
        }

        @Override // com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o.InterfaceC19367OooO00o
        public final void onMove(int i, int i2) {
            List<FavoritePenVO> list = this.f76908OooO00o;
            FavoriteToolBox favoriteToolBox = FavoriteToolBox.this;
            if (list == null || list.isEmpty()) {
                C29938OooO00o c29938OooO00o = favoriteToolBox.f76891OooOoO0;
                if (c29938OooO00o == null) {
                    OooOOO0.OooOOOO("penListAdapter");
                    throw null;
                }
                this.f76908OooO00o = OooOo.o0ooOO0(c29938OooO00o.f106299OooO00o);
            }
            if (i < i2) {
                while (i < i2) {
                    List<FavoritePenVO> list2 = this.f76908OooO00o;
                    OooOOO0.OooO0Oo(list2);
                    int i3 = i + 1;
                    Collections.swap(list2, i, i3);
                    i = i3;
                }
            } else {
                int i4 = i2 + 1;
                if (i4 <= i) {
                    while (true) {
                        List<FavoritePenVO> list3 = this.f76908OooO00o;
                        OooOOO0.OooO0Oo(list3);
                        Collections.swap(list3, i, i - 1);
                        if (i == i4) {
                            break;
                        } else {
                            i--;
                        }
                    }
                }
            }
            C29938OooO00o c29938OooO00o2 = favoriteToolBox.f76891OooOoO0;
            if (c29938OooO00o2 == null) {
                OooOOO0.OooOOOO("penListAdapter");
                throw null;
            }
            List<FavoritePenVO> list4 = this.f76908OooO00o;
            OooOOO0.OooO0Oo(list4);
            c29938OooO00o2.OooO0OO(list4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteToolBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f76895OooOooO = 1;
        this.f76898Oooo000 = new Handler(Looper.getMainLooper());
        this.f76899Oooo00O = new AtomicBoolean(false);
        this.f76900Oooo00o = new C25907OooO00o(new Oooo000(), 800L);
        this.f76897Oooo0 = new C25907OooO00o(new Oooo000(), 300L);
        View.inflate(context, R.layout.layout_favorite_tool_box, this);
        this.f76901Oooo0O0 = new androidx.core.widget.OooO00o(this, 3);
    }

    public static void OooO00o(FavoriteToolBox favoriteToolBox, OooO00o oooO00o) {
        float minX;
        float fMax;
        ViewParent parent = favoriteToolBox.getParent();
        OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        Float f = oooO00o.f76904OooO0OO;
        Float f2 = oooO00o.f76905OooO0Oo;
        if (f == null || f2 == null) {
            minX = favoriteToolBox.getMinX();
            fMax = Math.max(favoriteToolBox.getMinY(), (height - favoriteToolBox.getHeight()) / 2.0f);
        } else {
            float f3 = width;
            minX = Math.max(Math.min(f2.floatValue() * f3, f3 - o000000O.OooO0o0(56.0f)), favoriteToolBox.getMinX());
            fMax = Math.max(f.floatValue() * height, favoriteToolBox.getMinY());
        }
        if (parent instanceof ConstraintLayout) {
            androidx.constraintlayout.widget.OooO0OO oooO0OO = new androidx.constraintlayout.widget.OooO0OO();
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            oooO0OO.OooO0o0(constraintLayout);
            oooO0OO.OooOO0(favoriteToolBox.getId()).f64013OooO0o.f64124OooOO0 = minX;
            oooO0OO.OooOO0(favoriteToolBox.getId()).f64013OooO0o.f64125OooOO0O = fMax;
            oooO0OO.OooO0O0(constraintLayout);
            TransitionManager.beginDelayedTransition(viewGroup);
        } else {
            favoriteToolBox.setTranslationX(minX);
            favoriteToolBox.setTranslationY(fMax);
            favoriteToolBox.requestLayout();
        }
        favoriteToolBox.OooO0Oo((f == null || f2 == null) ? 1 : oooO00o.f76903OooO0O0, false);
        favoriteToolBox.setVisibility(oooO00o.f76902OooO00o ? 0 : 8);
    }

    public static void OooO0O0(FavoriteToolBox favoriteToolBox, MotionEvent motionEvent) {
        float x;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            favoriteToolBox.f76894OooOoo0 = rawX;
            favoriteToolBox.f76893OooOoo = rawY;
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float f = rawX - favoriteToolBox.f76894OooOoo0;
                float f2 = rawY - favoriteToolBox.f76893OooOoo;
                float minX = favoriteToolBox.getMinX();
                OooOOO0.OooO0o0(favoriteToolBox.getParent(), "null cannot be cast to non-null type android.view.View");
                favoriteToolBox.setX(Math.max(minX, Math.min(favoriteToolBox.getX() + f, ((View) r7).getWidth() - o000000O.OooO0o0(56.0f))));
                float minY = favoriteToolBox.getMinY();
                OooOOO0.OooO0o0(favoriteToolBox.getParent(), "null cannot be cast to non-null type android.view.View");
                favoriteToolBox.setY(Math.max(minY, Math.min(favoriteToolBox.getY() + f2, ((View) r6).getHeight() - o000000O.OooO0o0(60.0f))));
                favoriteToolBox.f76894OooOoo0 = rawX;
                favoriteToolBox.f76893OooOoo = rawY;
                if (favoriteToolBox.getY() < o000000O.OooO0o(50)) {
                    favoriteToolBox.OooO0Oo(0, true);
                    return;
                } else {
                    if (favoriteToolBox.getX() < o000000O.OooO0o(50)) {
                        favoriteToolBox.OooO0Oo(1, true);
                        return;
                    }
                    return;
                }
            }
            if (action != 3) {
                return;
            }
        }
        ViewParent parent = favoriteToolBox.getParent();
        OooOOO0.OooO0o0(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int width = ((ViewGroup) parent).getWidth();
        ViewParent parent2 = favoriteToolBox.getParent();
        OooOOO0.OooO0o0(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        int height = ((ViewGroup) parent2).getHeight();
        float y = 0.0f;
        if (favoriteToolBox.getY() < ((float) o000000O.OooO0o(50))) {
            favoriteToolBox.setY(favoriteToolBox.getMinY());
            x = favoriteToolBox.getX() / width;
        } else if (favoriteToolBox.getX() < o000000O.OooO0o(50)) {
            favoriteToolBox.setX(favoriteToolBox.getMinX());
            y = favoriteToolBox.getY() / height;
            x = 0.0f;
        } else {
            y = favoriteToolBox.getY() / height;
            x = favoriteToolBox.getX() / width;
        }
        OooO0O0 oooO0O0 = favoriteToolBox.toolBoxListener;
        if (oooO0O0 != null) {
            oooO0O0.OooO0o0(y, x);
        }
    }

    private final float getMinX() {
        return o000000O.OooO0o0(16.0f);
    }

    private final float getMinY() {
        Context context = getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        Activity activityOooO00o = C28036OooO0O0.OooO00o(context);
        return activityOooO00o != null ? activityOooO00o.isInMultiWindowMode() : false ? getContext().getResources().getDimension(R.dimen.margin_top_for_multi_window) : o000000O.OooO0o0(0.0f);
    }

    public final void OooO0OO(boolean z) {
        View view = this.f76892OooOoOO;
        if (view == null) {
            OooOOO0.OooOOOO("btnBottom");
            throw null;
        }
        view.setActivated(z);
        C29938OooO00o c29938OooO00o = this.f76891OooOoO0;
        if (c29938OooO00o != null) {
            OooO0o0(OooOo.o0ooOO0(c29938OooO00o.f106299OooO00o));
        } else {
            OooOOO0.OooOOOO("penListAdapter");
            throw null;
        }
    }

    public final void OooO0Oo(int i, boolean z) {
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2;
        this.f76895OooOooO = i;
        OooO0O0 oooO0O0 = this.toolBoxListener;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(i);
        }
        if (i == 1) {
            View view = this.f76892OooOoOO;
            if (view == null) {
                OooOOO0.OooOOOO("btnBottom");
                throw null;
            }
            view.setRotation(0.0f);
        } else {
            View view2 = this.f76892OooOoOO;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnBottom");
                throw null;
            }
            view2.setRotation(90.0f);
        }
        if (i == 0) {
            if (!z) {
                setRotation(-90.0f);
            } else if (Math.abs(getRotation() + 90.0f) >= 1.0E-5d && ((oooO0OO2 = this.f76896OooOooo) == null || oooO0OO2.f76906OooO00o != 0 || !oooO0OO2.f76907OooO0O0.isStarted())) {
                OooO0OO oooO0OO3 = this.f76896OooOooo;
                if (oooO0OO3 != null) {
                    oooO0OO3.f76907OooO0O0.end();
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rotation", getRotation(), -90.0f);
                objectAnimatorOfFloat.setStartDelay(100L);
                objectAnimatorOfFloat.setDuration(360L);
                objectAnimatorOfFloat.addListener(new C29943OooO0oO(this));
                this.f76896OooOooo = new OooO0OO(0, objectAnimatorOfFloat);
                objectAnimatorOfFloat.start();
            }
        } else if (!z) {
            setRotation(0.0f);
        } else if (Math.abs(getRotation()) >= 1.0E-5d && ((oooO0OO = this.f76896OooOooo) == null || oooO0OO.f76906OooO00o != 1 || !oooO0OO.f76907OooO0O0.isStarted())) {
            OooO0OO oooO0OO4 = this.f76896OooOooo;
            if (oooO0OO4 != null) {
                oooO0OO4.f76907OooO0O0.end();
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "rotation", getRotation(), 0.0f);
            objectAnimatorOfFloat2.setStartDelay(100L);
            objectAnimatorOfFloat2.setDuration(360L);
            objectAnimatorOfFloat2.addListener(new C29944OooO0oo(this));
            this.f76896OooOooo = new OooO0OO(1, objectAnimatorOfFloat2);
            objectAnimatorOfFloat2.start();
        }
        C29938OooO00o c29938OooO00o = this.f76891OooOoO0;
        if (c29938OooO00o == null) {
            OooOOO0.OooOOOO("penListAdapter");
            throw null;
        }
        FavoritePenVO favoritePenVO = (FavoritePenVO) OooOo.Oooo(OooOo.o0ooOO0(c29938OooO00o.f106299OooO00o));
        Integer numValueOf = favoritePenVO != null ? Integer.valueOf(favoritePenVO.getOrientation()) : null;
        int i2 = this.f76895OooOooO;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            return;
        }
        C29938OooO00o c29938OooO00o2 = this.f76891OooOoO0;
        if (c29938OooO00o2 != null) {
            OooO0o0(OooOo.o0ooOO0(c29938OooO00o2.f106299OooO00o));
        } else {
            OooOOO0.OooOOOO("penListAdapter");
            throw null;
        }
    }

    public final void OooO0o0(List<FavoritePenVO> penList) {
        OooOOO0.OooO0oO(penList, "penList");
        View view = this.f76892OooOoOO;
        if (view == null) {
            OooOOO0.OooOOOO("btnBottom");
            throw null;
        }
        boolean zIsActivated = view.isActivated();
        List<FavoritePenVO> list = penList;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(FavoritePenVO.copy$default((FavoritePenVO) it.next(), null, 0, null, 0, 0.0f, false, zIsActivated, this.f76895OooOooO, 63, null));
        }
        C29938OooO00o c29938OooO00o = this.f76891OooOoO0;
        if (c29938OooO00o == null) {
            OooOOO0.OooOOOO("penListAdapter");
            throw null;
        }
        int size = c29938OooO00o.f106299OooO00o.size();
        C29938OooO00o c29938OooO00o2 = this.f76891OooOoO0;
        if (c29938OooO00o2 != null) {
            c29938OooO00o2.OooO0OO(arrayList, new RunnableC29941OooO0Oo(size, arrayList, this));
        } else {
            OooOOO0.OooOOOO("penListAdapter");
            throw null;
        }
    }

    public final OooO0O0 getToolBoxListener() {
        return this.toolBoxListener;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.btn_bottom);
        this.f76892OooOoOO = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnBottom");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC29184OooO0Oo(this, 2));
        this.f76888OooOo = (RecyclerView) findViewById(R.id.pen_list);
        this.f76891OooOoO0 = new C29938OooO00o();
        C22041OooOOo c22041OooOOo = new C22041OooOOo(new com.orion.notein.p607ui.noteeditor.propertypanel.comment.OooO00o(new C23614OooO0Oo()));
        RecyclerView recyclerView = this.f76888OooOo;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("penListView");
            throw null;
        }
        c22041OooOOo.OooO0o(recyclerView);
        C29938OooO00o c29938OooO00o = this.f76891OooOoO0;
        if (c29938OooO00o == null) {
            OooOOO0.OooOOOO("penListAdapter");
            throw null;
        }
        c29938OooO00o.f106300OooO0O0 = new ViewOnClickListenerC28305OooO(this, 3);
        RecyclerView recyclerView2 = this.f76888OooOo;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("penListView");
            throw null;
        }
        recyclerView2.setAdapter(c29938OooO00o);
        setPivotX(o000000O.OooO0o0(20.0f));
        setPivotY(o000000O.OooO0o0(20.0f));
        View viewFindViewById2 = findViewById(R.id.toolbox_handle);
        this.f76890OooOoO = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnTouchListener(new ViewOnTouchListenerC29732OooO00o(this, 1));
        } else {
            OooOOO0.OooOOOO("moveHandle");
            throw null;
        }
    }

    public final void setToolBoxListener(OooO0O0 oooO0O0) {
        this.toolBoxListener = oooO0O0;
    }
}
