package com.orion.editor.p600ui.contextmenu;

import Oooo0.C20857Oooooo;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.orion.editor.p600ui.contextmenu.NoteInContextMenu;
import com.orion.notein.global.R;
import o0O0o0oO.ViewOnClickListenerC26036Oooo;
import o0O0o0oO.ViewOnClickListenerC26047OoooO00;

/* JADX INFO: loaded from: classes9.dex */
public class NoteInContextMenu extends FrameLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public HorizontalScrollView f69376OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public FrameLayout f69377OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ImageView f69378OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public LinearLayout f69379OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ImageView f69380OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f69381OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f69382OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f69383OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ImageView f69384OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f69385Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final int f69386Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f69387Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final int f69388Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final int f69389Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final int f69390Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final int f69391Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f69392Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final int f69393Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f69394Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f69395Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f69396OoooO00;

    public class OooO00o implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f69397OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ NoteInContextMenu f69398OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ int f69399OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ int f69400OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final /* synthetic */ int f69401OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ int f69403OooOoo0;

        public OooO00o(NoteInContextMenu noteInContextMenu, int i, int i2, int i3, int i4, int i5) {
            this.f69398OooOo0o = noteInContextMenu;
            this.f69397OooOo = i;
            this.f69400OooOoO0 = i2;
            this.f69399OooOoO = i3;
            this.f69401OooOoOO = i4;
            this.f69403OooOoo0 = i5;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z;
            this.f69398OooOo0o.removeOnLayoutChangeListener(this);
            int width = view.getWidth();
            NoteInContextMenu noteInContextMenu = NoteInContextMenu.this;
            if (width > noteInContextMenu.f69394Oooo0oO) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) noteInContextMenu.f69377OooOo0o.getLayoutParams();
                layoutParams.width = noteInContextMenu.f69394Oooo0oO;
                noteInContextMenu.f69377OooOo0o.setLayoutParams(layoutParams);
                width = noteInContextMenu.f69394Oooo0oO;
                z = true;
            } else {
                z = false;
            }
            final int i9 = width;
            final boolean z2 = z;
            int height = view.getHeight();
            final float f = this.f69397OooOo - (i9 / 2.0f);
            noteInContextMenu.setX(f);
            int i10 = this.f69400OooOoO0 - height;
            int i11 = noteInContextMenu.f69392Oooo0o;
            if (i10 < i11) {
                i10 = i11;
            }
            noteInContextMenu.setY(i10);
            final int i12 = this.f69401OooOoOO;
            final int i13 = this.f69403OooOoo0;
            final int i14 = this.f69397OooOo;
            final NoteInContextMenu noteInContextMenu2 = this.f69398OooOo0o;
            final int i15 = this.f69399OooOoO;
            noteInContextMenu.post(new Runnable() { // from class: o0O0o0oO.OoooO0
                @Override // java.lang.Runnable
                public final void run() {
                    NoteInContextMenu.OooO00o oooO00o = this.f88924OooOo0o;
                    float f2 = i14;
                    int i16 = i9;
                    float f3 = f2 - (i16 / 2.0f);
                    NoteInContextMenu noteInContextMenu3 = noteInContextMenu2;
                    float left = noteInContextMenu3.getLeft() + f3;
                    int i17 = i15;
                    float right = (i17 - f3) - noteInContextMenu3.getRight();
                    NoteInContextMenu noteInContextMenu4 = NoteInContextMenu.this;
                    float f4 = noteInContextMenu4.f69383OooOooO * 2;
                    boolean z3 = true;
                    boolean z4 = left < f4;
                    boolean z5 = right < f4;
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) noteInContextMenu4.f69384OooOooo.getLayoutParams();
                    int i18 = noteInContextMenu4.f69383OooOooO;
                    if (i17 < i12) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) noteInContextMenu4.f69377OooOo0o.getLayoutParams();
                        layoutParams3.width = Math.min(i13, i17) - (i18 * 2);
                        noteInContextMenu4.f69377OooOo0o.setLayoutParams(layoutParams3);
                        noteInContextMenu4.setX(i18);
                    } else if (z4 || z5) {
                        int i19 = i18 * 2;
                        if (i16 + i19 < i17) {
                            float f5 = f;
                            noteInContextMenu4.setX(z4 ? (f5 - left) + i18 : (f5 + right) - i18);
                            z3 = false;
                        } else {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) noteInContextMenu4.f69377OooOo0o.getLayoutParams();
                            layoutParams4.width = i17 - i19;
                            noteInContextMenu4.f69377OooOo0o.setLayoutParams(layoutParams4);
                            noteInContextMenu4.setX(i18);
                        }
                    } else {
                        z3 = false;
                    }
                    int width2 = (noteInContextMenu4.f69377OooOo0o.getWidth() / 2) - noteInContextMenu4.f69387Oooo000;
                    if (z4) {
                        layoutParams2.setMargins(0, 0, Math.min(width2, Math.abs((int) left)), 0);
                    } else if (z5) {
                        layoutParams2.setMargins(Math.min(width2, Math.abs((int) right)), 0, 0, 0);
                    } else {
                        layoutParams2.setMargins(0, 0, 0, 0);
                    }
                    noteInContextMenu4.f69384OooOooo.setLayoutParams(layoutParams2);
                    if (z2 || z3) {
                        noteInContextMenu4.f69380OooOoOO.setVisibility(0);
                        noteInContextMenu4.f69376OooOo.setOnScrollChangeListener(noteInContextMenu4.getOnScrollChangeListener());
                    }
                    noteInContextMenu4.f69376OooOo.scrollTo(0, 0);
                }
            });
        }
    }

    public NoteInContextMenu(Context context) {
        super(context);
        this.f69389Oooo00o = R.drawable.ic_editor_context_menu_notch;
        this.f69386Oooo0 = R.drawable.bg_editor_lasso_context_menu;
        this.f69390Oooo0O0 = R.drawable.editor_bg_menu_item_new_selector;
        this.f69395Oooo0oo = R.drawable.context_menu_left_handle;
        this.f69385Oooo = R.drawable.context_menu_right_handle;
        this.f69396OoooO00 = R.drawable.bg_editor_lasso_context_menu;
        this.f69382OooOoo0 = C20857Oooooo.OooO0O0(context, 36);
        this.f69381OooOoo = C20857Oooooo.OooO0O0(context, 2);
        this.f69383OooOooO = C20857Oooooo.OooO0O0(context, 6);
        this.f69387Oooo000 = C20857Oooooo.OooO0O0(context, 14);
        this.f69388Oooo00O = C20857Oooooo.OooO0O0(context, 7);
        this.f69394Oooo0oO = C20857Oooooo.OooO0O0(context, EditingLanguage.FAEROESE);
        this.f69392Oooo0o = C20857Oooooo.OooO0O0(context, 24);
        int iOooO0O0 = C20857Oooooo.OooO0O0(context, 14);
        this.f69391Oooo0OO = iOooO0O0;
        this.f69393Oooo0o0 = iOooO0O0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View.OnScrollChangeListener getOnScrollChangeListener() {
        return new View.OnScrollChangeListener() { // from class: o0O0o0oO.Oooo0oo
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                NoteInContextMenu noteInContextMenu = this.f88920OooO00o;
                if (i == 0) {
                    noteInContextMenu.f69378OooOoO.setVisibility(8);
                } else {
                    noteInContextMenu.f69378OooOoO.setVisibility(0);
                }
                if (noteInContextMenu.f69376OooOo.getWidth() + i >= noteInContextMenu.f69379OooOoO0.getWidth()) {
                    noteInContextMenu.f69380OooOoOO.setVisibility(8);
                } else {
                    noteInContextMenu.f69380OooOoOO.setVisibility(0);
                }
            }
        };
    }

    public final void OooO0O0(View view) {
        OooO0o0();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C20857Oooooo.OooO0O0(getContext(), 48), this.f69382OooOoo0);
        layoutParams.gravity = 1;
        this.f69379OooOoO0.addView(view, layoutParams);
    }

    public final void OooO0OO(int i, View.OnClickListener onClickListener) {
        Drawable drawable = getContext().getDrawable(i);
        ImageView imageView = new ImageView(getContext());
        imageView.setPointerIcon(PointerIcon.getSystemIcon(getContext(), 1002));
        imageView.setImageDrawable(drawable);
        imageView.setClickable(true);
        imageView.setOnClickListener(onClickListener);
        imageView.setBackgroundResource(this.f69390Oooo0O0);
        imageView.setPadding(this.f69391Oooo0OO, 0, this.f69393Oooo0o0, 0);
        OooO0o0();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C20857Oooooo.OooO0O0(getContext(), 48), this.f69382OooOoo0);
        layoutParams.gravity = 1;
        this.f69379OooOoO0.addView(imageView, layoutParams);
    }

    public final void OooO0Oo(ViewGroup viewGroup) {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f69377OooOo0o = frameLayout;
        frameLayout.setBackgroundResource(this.f69386Oooo0);
        this.f69377OooOo0o.setElevation(C20857Oooooo.OooO0O0(getContext(), 3));
        this.f69377OooOo0o.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        int iOooO0O0 = C20857Oooooo.OooO0O0(getContext(), 3);
        int i = this.f69382OooOoo0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, i);
        layoutParams.gravity = 48;
        layoutParams.setMargins(iOooO0O0, 0, iOooO0O0, 0);
        FrameLayout frameLayout2 = this.f69377OooOo0o;
        int i2 = this.f69381OooOoo;
        frameLayout2.setPadding(i2, 0, i2, 0);
        addView(this.f69377OooOo0o, layoutParams);
        ImageView imageView = new ImageView(getContext());
        this.f69384OooOooo = imageView;
        imageView.setImageResource(this.f69389Oooo00o);
        this.f69384OooOooo.setScaleType(ImageView.ScaleType.CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        addView(this.f69384OooOooo, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, i);
        this.f69376OooOo = new HorizontalScrollView(getContext());
        OooO0o0();
        this.f69376OooOo.addView(this.f69379OooOoO0);
        this.f69377OooOo0o.addView(this.f69376OooOo, layoutParams3);
        int iOooO0O02 = C20857Oooooo.OooO0O0(getContext(), 48);
        int iOooO0O03 = C20857Oooooo.OooO0O0(getContext(), 36);
        int iOooO0O04 = C20857Oooooo.OooO0O0(getContext(), 6);
        int iOooO0O05 = C20857Oooooo.OooO0O0(getContext(), 12);
        ImageView imageView2 = new ImageView(getContext());
        this.f69378OooOoO = imageView2;
        imageView2.setOnClickListener(new ViewOnClickListenerC26036Oooo(this, 0));
        ImageView imageView3 = this.f69378OooOoO;
        int i3 = this.f69396OoooO00;
        imageView3.setBackgroundResource(i3);
        this.f69378OooOoO.setImageResource(this.f69395Oooo0oo);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iOooO0O02, iOooO0O03);
        this.f69378OooOoO.setPadding(iOooO0O05, iOooO0O04, iOooO0O05, iOooO0O04);
        this.f69378OooOoO.setVisibility(8);
        layoutParams4.gravity = 19;
        this.f69377OooOo0o.addView(this.f69378OooOoO, layoutParams4);
        ImageView imageView4 = new ImageView(getContext());
        this.f69380OooOoOO = imageView4;
        imageView4.setOnClickListener(new ViewOnClickListenerC26047OoooO00(this, 0));
        this.f69380OooOoOO.setBackgroundResource(i3);
        this.f69380OooOoOO.setImageResource(this.f69385Oooo);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iOooO0O02, iOooO0O03);
        this.f69380OooOoOO.setPadding(iOooO0O05, iOooO0O04, iOooO0O05, iOooO0O04);
        this.f69380OooOoOO.setVisibility(8);
        layoutParams5.gravity = 21;
        this.f69377OooOo0o.addView(this.f69380OooOoOO, layoutParams5);
        viewGroup.addView(this, new ViewGroup.LayoutParams(-2, i + this.f69388Oooo00O));
    }

    public final boolean OooO0o() {
        return getVisibility() == 0;
    }

    public final void OooO0o0() {
        if (this.f69379OooOoO0 == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f69379OooOoO0 = linearLayout;
            linearLayout.setOrientation(0);
        }
    }

    public final void OooO0oO(int i, int i2, int i3) {
        int iOooO0O0 = C20857Oooooo.OooO0O0(getContext(), 300);
        int iOooO0O02 = C20857Oooooo.OooO0O0(getContext(), StyleIdentifier.LIST_TABLE_2_ACCENT_1);
        this.f69378OooOoO.setVisibility(8);
        this.f69380OooOoOO.setVisibility(8);
        this.f69376OooOo.setOnScrollChangeListener(null);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f69377OooOo0o.getLayoutParams();
        layoutParams.width = -2;
        this.f69377OooOo0o.setLayoutParams(layoutParams);
        addOnLayoutChangeListener(new OooO00o(this, i, i2, i3, iOooO0O02, iOooO0O0));
        setVisibility(0);
        invalidate();
    }
}
