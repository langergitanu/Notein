package com.orion.editor.p600ui.zoom;

import Oooo0.C20857Oooooo;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.editor.p600ui.zoom.DefaultZoomHandle;
import com.orion.notein.global.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOo.C24341OooO00o;
import o0000oo0.C24356OooO0O0;
import o00O00o0.OooO0O0;
import o00Oo000.C25034OooO00o;
import o0O0oO0o.C26095OooO0O0;
import o0O0oO0o.C26098OooO0oO;
import o0O0oO0o.C26103OooOOo0;
import o0O0oO0o.InterfaceC26102OooOOo;
import o0O0oO0o.OooO0OO;
import o0O0oO0o.OooO0o;
import o0O0oO0o.OooOOO;
import o0O0oO0o.ViewOnClickListenerC26097OooO0o0;
import o0O0oOO0.C26113OooO00o;
import o0O0oOO0.C26116OooO0Oo;
import o0OoO0oo.C28839o00O0Oo0;
import o0oOo0O0.C30956OooO0o;
import o0oOo0O0.InterfaceC30953OooO0O0;
import o0oOo0O0.ViewOnLayoutChangeListenerC30958OooO0oO;
import oO00o.AbstractC32314OooO00o;
import oO00o.AbstractC32318OooO0o;
import oO00o0oo.C32394OooO00o;
import oO00oOO.C32416OooO0OO;
import oO00oOo.C32428OooO00o;
import oO00ooO.C32443OooOOO;
import oO0OooOo.C33505OooO0O0;
import oO0OooOo.C33506OooO0OO;
import oO0OooOo.C33507OooO0Oo;
import oO0OooOo.C33508OooO0o0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.o0000oO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0.C33850OooO0O0;
import oO0o0o0.C33856OooO0oo;
import oO0o0o0.InterfaceC33849OooO00o;
import oOO00oo.C34406OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultZoomHandle extends LinearLayout implements InterfaceC26102OooOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C30956OooO0o f69424OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f69425OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Context f69426OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PDFView f69427OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final TextView f69428OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final ImageView f69429OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final ImageView f69430OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final ImageView f69431OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Toast f69432OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Handler f69433Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C26103OooOOo0 f69434Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final com.google.gson.internal.OooO00o f69435Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final OooOOO f69436Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final OooO00o f69437Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f69438Oooo0OO;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DefaultZoomHandle.this.hide();
        }
    }

    public DefaultZoomHandle(Context context, boolean z, com.google.gson.internal.OooO00o oooO00o) {
        super(context);
        this.f69425OooOo0o = "100%";
        this.f69433Oooo0 = new Handler();
        this.f69437Oooo0O0 = new OooO00o();
        this.f69438Oooo0OO = z;
        this.f69426OooOoO = context;
        TextView textView = new TextView(context);
        this.f69428OooOoOO = textView;
        textView.setText("1600%");
        this.f69428OooOoOO.setTextColor(ContextCompat.getColor(context, R.color.zoom_text_color));
        this.f69428OooOoOO.setTextSize(1, 13.0f);
        this.f69428OooOoOO.setGravity(21);
        ImageView imageView = new ImageView(context);
        this.f69430OooOoo0 = imageView;
        imageView.setImageResource(this.f69438Oooo0OO ? R.drawable.ic_ni_lock : R.drawable.ic_ni_unlock);
        ImageView imageView2 = this.f69430OooOoo0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.f69430OooOoo0.setAdjustViewBounds(true);
        this.f69430OooOoo0.setOnClickListener(new OooO0OO(this));
        ImageView imageView3 = new ImageView(context);
        this.f69429OooOoo = imageView3;
        imageView3.setImageResource(R.drawable.ic_ni_star_scale_selector);
        this.f69429OooOoo.setScaleType(scaleType);
        this.f69429OooOoo.setAdjustViewBounds(true);
        this.f69429OooOoo.setOnClickListener(new ViewOnClickListenerC26097OooO0o0(this, context));
        ImageView imageView4 = new ImageView(context);
        this.f69431OooOooO = imageView4;
        imageView4.setImageResource(R.drawable.ic_ni_drop_down);
        this.f69431OooOooO.setOnClickListener(new OooO0o(this));
        setVisibility(0);
        this.f69434Oooo000 = new C26103OooOOo0(this.f69426OooOoO, new C26098OooO0oO(this));
        this.f69436Oooo00o = new OooOOO(new OooO0O0(this, 2));
        this.f69435Oooo00O = oooO00o;
        final C30956OooO0o c30956OooO0o = new C30956OooO0o(context);
        this.f69424OooOo = c30956OooO0o;
        c30956OooO0o.f110620OooO0O0 = this;
        setOnTouchListener(new View.OnTouchListener() { // from class: o0oOo0O0.OooO0o0
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
            
                if (r4 != 3) goto L16;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C30956OooO0o c30956OooO0o2 = c30956OooO0o;
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0) {
                        c30956OooO0o2.f110622OooO0Oo = motionEvent.getX();
                        c30956OooO0o2.f110624OooO0o0 = motionEvent.getY();
                        c30956OooO0o2.f110621OooO0OO = false;
                        viewGroup.requestDisallowInterceptTouchEvent(true);
                        C26095OooO0O0 c26095OooO0O0 = c30956OooO0o2.f110623OooO0o;
                        if (c26095OooO0O0 != null) {
                            c26095OooO0O0.invoke();
                        }
                    } else if (actionMasked == 1) {
                        if (c30956OooO0o2.f110621OooO0OO) {
                            DefaultZoomHandle defaultZoomHandle = c30956OooO0o2.f110620OooO0O0;
                            if (defaultZoomHandle == null) {
                                OooOOO0.OooOOOO("host");
                                throw null;
                            }
                            Object parent2 = defaultZoomHandle.getParent();
                            View view2 = parent2 instanceof View ? (View) parent2 : null;
                            if (view2 != null) {
                                InterfaceC30952OooO00o interfaceC30952OooO00o = c30956OooO0o2.f110627OooOO0;
                                DefaultZoomHandle defaultZoomHandle2 = c30956OooO0o2.f110620OooO0O0;
                                if (defaultZoomHandle2 == null) {
                                    OooOOO0.OooOOOO("host");
                                    throw null;
                                }
                                int x = (int) defaultZoomHandle2.getX();
                                DefaultZoomHandle defaultZoomHandle3 = c30956OooO0o2.f110620OooO0O0;
                                if (defaultZoomHandle3 == null) {
                                    OooOOO0.OooOOOO("host");
                                    throw null;
                                }
                                C32443OooOOO c32443OooOOOOooO00o = interfaceC30952OooO00o.OooO00o(defaultZoomHandle2, view2, x, (int) defaultZoomHandle3.getY());
                                if (c32443OooOOOOooO00o != null) {
                                    int iIntValue = ((Number) c32443OooOOOOooO00o.f116638OooOo0o).intValue();
                                    int iIntValue2 = ((Number) c32443OooOOOOooO00o.f116637OooOo).intValue();
                                    DefaultZoomHandle defaultZoomHandle4 = c30956OooO0o2.f110620OooO0O0;
                                    if (defaultZoomHandle4 == null) {
                                        OooOOO0.OooOOOO("host");
                                        throw null;
                                    }
                                    defaultZoomHandle4.setX(iIntValue);
                                    DefaultZoomHandle defaultZoomHandle5 = c30956OooO0o2.f110620OooO0O0;
                                    if (defaultZoomHandle5 == null) {
                                        OooOOO0.OooOOOO("host");
                                        throw null;
                                    }
                                    defaultZoomHandle5.setY(iIntValue2);
                                }
                            }
                            DefaultZoomHandle defaultZoomHandle6 = c30956OooO0o2.f110620OooO0O0;
                            if (defaultZoomHandle6 == null) {
                                OooOOO0.OooOOOO("host");
                                throw null;
                            }
                            Object parent3 = defaultZoomHandle6.getParent();
                            View view3 = parent3 instanceof View ? (View) parent3 : null;
                            if (view3 != null) {
                                int width = view3.getWidth();
                                DefaultZoomHandle defaultZoomHandle7 = c30956OooO0o2.f110620OooO0O0;
                                if (defaultZoomHandle7 == null) {
                                    OooOOO0.OooOOOO("host");
                                    throw null;
                                }
                                int width2 = (width - defaultZoomHandle7.getWidth()) - (c30956OooO0o2.OooO0O0() * 2);
                                int height = view3.getHeight();
                                DefaultZoomHandle defaultZoomHandle8 = c30956OooO0o2.f110620OooO0O0;
                                if (defaultZoomHandle8 == null) {
                                    OooOOO0.OooOOOO("host");
                                    throw null;
                                }
                                int height2 = (height - defaultZoomHandle8.getHeight()) - (c30956OooO0o2.OooO0O0() * 2);
                                if (width2 > 0 && height2 > 0) {
                                    DefaultZoomHandle defaultZoomHandle9 = c30956OooO0o2.f110620OooO0O0;
                                    if (defaultZoomHandle9 == null) {
                                        OooOOO0.OooOOOO("host");
                                        throw null;
                                    }
                                    float x2 = (defaultZoomHandle9.getX() - c30956OooO0o2.OooO0O0()) / width2;
                                    DefaultZoomHandle defaultZoomHandle10 = c30956OooO0o2.f110620OooO0O0;
                                    if (defaultZoomHandle10 == null) {
                                        OooOOO0.OooOOOO("host");
                                        throw null;
                                    }
                                    float y = (defaultZoomHandle10.getY() - c30956OooO0o2.OooO0O0()) / height2;
                                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o.OooOOO0("PrefMovableBehavior");
                                    c20358OooO00o.OooO0o0("notifyBias -> h=" + x2 + " v=" + y, new Object[0]);
                                    C28839o00O0Oo0 c28839o00O0Oo0 = c30956OooO0o2.f110618OooO;
                                    if (c28839o00O0Oo0 != null) {
                                        c28839o00O0Oo0.invoke(Float.valueOf(x2), Float.valueOf(y));
                                    }
                                    c30956OooO0o2.OooO00o(x2, y);
                                }
                            }
                        } else {
                            view.performClick();
                        }
                        c30956OooO0o2.f110621OooO0OO = false;
                        C26095OooO0O0 c26095OooO0O02 = c30956OooO0o2.f110623OooO0o;
                        if (c26095OooO0O02 != null) {
                            c26095OooO0O02.invoke();
                            return true;
                        }
                    } else if (actionMasked == 2) {
                        viewGroup.getLocationOnScreen(new int[2]);
                        float rawX = (motionEvent.getRawX() - r4[0]) - c30956OooO0o2.f110622OooO0Oo;
                        float rawY = (motionEvent.getRawY() - r4[1]) - c30956OooO0o2.f110624OooO0o0;
                        float fMax = Math.max(c30956OooO0o2.OooO0O0(), Math.min(rawX, (viewGroup.getWidth() - view.getWidth()) - c30956OooO0o2.OooO0O0()));
                        float fMax2 = Math.max(c30956OooO0o2.OooO0O0(), Math.min(rawY, (viewGroup.getHeight() - view.getHeight()) - c30956OooO0o2.OooO0O0()));
                        int i = (int) fMax;
                        int i2 = (int) fMax2;
                        DefaultZoomHandle defaultZoomHandle11 = c30956OooO0o2.f110620OooO0O0;
                        if (defaultZoomHandle11 == null) {
                            OooOOO0.OooOOOO("host");
                            throw null;
                        }
                        defaultZoomHandle11.setX(i);
                        DefaultZoomHandle defaultZoomHandle12 = c30956OooO0o2.f110620OooO0O0;
                        if (defaultZoomHandle12 == null) {
                            OooOOO0.OooOOOO("host");
                            throw null;
                        }
                        defaultZoomHandle12.setY(i2);
                        c30956OooO0o2.f110621OooO0OO = true;
                        C26095OooO0O0 c26095OooO0O03 = c30956OooO0o2.f110623OooO0o;
                        if (c26095OooO0O03 != null) {
                            c26095OooO0O03.invoke();
                            return true;
                        }
                    }
                    return true;
                }
                return false;
            }
        });
        c30956OooO0o.f110623OooO0o = new C26095OooO0O0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ActivityC21897OooOo0 getFragmentActivity() {
        for (Context baseContext = this.f69426OooOoO; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof ActivityC21897OooOo0) {
                return (ActivityC21897OooOo0) baseContext;
            }
        }
        return null;
    }

    @Override // o0O0oO0o.InterfaceC26102OooOOo
    public final void OooO00o() {
        oOO00OOO.OooO0OO oooO0OO;
        this.f69427OooOoO0.removeView(this);
        OooOOO oooOOO = this.f69436Oooo00o;
        if (oooOOO == null || (oooO0OO = oooOOO.f89109OooO00o) == null) {
            return;
        }
        oooO0OO.cancel();
        oooOOO.f89109OooO00o = null;
    }

    @Override // o0O0oO0o.InterfaceC26102OooOOo
    public final boolean OooO0OO() {
        boolean z;
        synchronized (this) {
            z = this.f69438Oooo0OO;
        }
        return z;
    }

    public final Toast OooO0Oo(String str) {
        View viewInflate = LayoutInflater.from(this.f69426OooOoO).inflate(R.layout.editor_view_custom_toast, (ViewGroup) null);
        viewInflate.setBackgroundResource(R.drawable.editor_bg_round_btn_black_normal);
        TextView textView = (TextView) viewInflate.findViewById(R.id.message);
        textView.setText(str);
        textView.setTextColor(-1);
        Toast toast = new Toast(this.f69426OooOoO);
        toast.setView(viewInflate);
        toast.setDuration(0);
        toast.setGravity(48, 0, this.f69426OooOoO.getResources().getDisplayMetrics().heightPixels / 2);
        return toast;
    }

    public final void OooO0o() {
        Handler handler = this.f69433Oooo0;
        OooO00o oooO00o = this.f69437Oooo0O0;
        handler.removeCallbacks(oooO00o);
        handler.postDelayed(oooO00o, 3000L);
    }

    public final ArrayList OooO0o0(ArrayList arrayList) {
        float minZoomLevel = this.f69427OooOoO0.getMinZoomLevel();
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = this.f69427OooOoO0.f69170OooOooO;
        boolean zOooO00o = abstractC22830OooO0Oo != null ? abstractC22830OooO0Oo.OooO00o(false) : false;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C26113OooO00o c26113OooO00o = (C26113OooO00o) arrayList.get(i);
            arrayList2.add(new C26116OooO0Oo(c26113OooO00o, new DecimalFormat("0%").format(c26113OooO00o.f89152OooO0O0).equals(this.f69425OooOo0o), !zOooO00o && c26113OooO00o.f89152OooO0O0 < minZoomLevel));
        }
        return arrayList2;
    }

    public InterfaceC30953OooO0O0 getMovable() {
        return this.f69424OooOo;
    }

    @Override // o0O0oO0o.InterfaceC26102OooOOo
    public final void hide() {
        this.f69434Oooo000.f89117OooO00o.dismiss();
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C30956OooO0o c30956OooO0o = this.f69424OooOo;
        DefaultZoomHandle defaultZoomHandle = c30956OooO0o.f110620OooO0O0;
        if (defaultZoomHandle != null) {
            defaultZoomHandle.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC30958OooO0oO(c30956OooO0o));
        } else {
            OooOOO0.OooOOOO("host");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C30956OooO0o c30956OooO0o = this.f69424OooOo;
        DefaultZoomHandle defaultZoomHandle = c30956OooO0o.f110620OooO0O0;
        if (defaultZoomHandle == null) {
            OooOOO0.OooOOOO("host");
            throw null;
        }
        ViewParent parent = defaultZoomHandle.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(null);
        }
        DefaultZoomHandle defaultZoomHandle2 = c30956OooO0o.f110620OooO0O0;
        if (defaultZoomHandle2 != null) {
            defaultZoomHandle2.setOnTouchListener(null);
        } else {
            OooOOO0.OooOOOO("host");
            throw null;
        }
    }

    @Override // o0O0oO0o.InterfaceC26102OooOOo
    public void setZoomLevel(float f) {
        show();
        float fRound = Math.round(f * 100.0f) / 100.0f;
        this.f69428OooOoOO.setTag(new C26113OooO00o(f, fRound));
        String str = new DecimalFormat("0%").format(fRound);
        this.f69425OooOo0o = str;
        this.f69428OooOoOO.setText(str);
        if (this.f69434Oooo000.f89117OooO00o.isShowing()) {
            this.f69434Oooo000.OooO00o(OooO0o0(this.f69436Oooo00o.OooO0O0()));
        }
        this.f69429OooOoo.setActivated(this.f69436Oooo00o.OooO0OO(fRound));
        OooO0o();
    }

    @Override // o0O0oO0o.InterfaceC26102OooOOo
    public void setupLayout(PDFView pDFView) {
        OooOOO oooOOO = this.f69436Oooo00o;
        Context context = this.f69426OooOoO;
        synchronized (oooOOO) {
            if (OooOOO.f89107OooO0Oo == null) {
                OooOOO.f89107OooO0Oo = new C24341OooO00o(context, "zoom-settings").OooO00o();
            }
        }
        C24356OooO0O0<AbstractC24338OooO0o0> c24356OooO0O0 = OooOOO.f89107OooO0Oo;
        InterfaceC33721OooO0o<AbstractC24338OooO0o0> data = c24356OooO0O0.f82135OooOo0o.f81918OooO00o.getData();
        InterfaceC34415OooO0oo interfaceC34415OooO0oo = c24356OooO0O0.f82134OooOo.f121916OooOo0o;
        InterfaceC33849OooO00o[] interfaceC33849OooO00oArr = C33856OooO0oo.f121981OooO00o;
        o0000oO o0000oo2 = C33649OoooOOo.f121329OooO0O0;
        o0000oo2.getClass();
        C33850OooO0O0 c33850OooO0O0 = new C33850OooO0O0(data, InterfaceC34415OooO0oo.OooO0O0.OooO00o.OooO0Oo(o0000oo2, interfaceC34415OooO0oo));
        int i = AbstractC32314OooO00o.f116231OooOo0o;
        C33506OooO0OO c33506OooO0OO = new C33506OooO0OO(new C33505OooO0O0(c33850OooO0O0), new com.aspose.slides.OooO0O0());
        C32416OooO0OO c32416OooO0OO = C32428OooO00o.f116617OooO00o;
        Objects.requireNonNull(c32416OooO0OO, "scheduler is null");
        C33506OooO0OO c33506OooO0OO2 = new C33506OooO0OO(new C33508OooO0o0(c33506OooO0OO, c32416OooO0OO), new com.aspose.slides.OooO0OO());
        AbstractC32318OooO0o abstractC32318OooO0oOooO00o = C32394OooO00o.OooO00o();
        int i2 = AbstractC32314OooO00o.f116231OooOo0o;
        C25034OooO00o.OooO0O0(i2, "bufferSize");
        new C33507OooO0Oo(c33506OooO0OO2, abstractC32318OooO0oOooO00o, i2).subscribe(new o0O0oO0o.OooOOO0(oooOOO));
        setBackgroundResource(R.drawable.zoom_handle_bg);
        setOrientation(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C20857Oooooo.OooO0O0(this.f69426OooOoO, 140), C20857Oooooo.OooO0O0(this.f69426OooOoO, 32));
        layoutParams.setMargins(0, C20857Oooooo.OooO0O0(this.f69426OooOoO, 152), 0, 0);
        layoutParams.addRule(14);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C20857Oooooo.OooO0O0(this.f69426OooOoO, 42), -1);
        layoutParams2.gravity = 16;
        layoutParams2.setMargins(C20857Oooooo.OooO0O0(this.f69426OooOoO, 12), 0, 0, 0);
        addView(this.f69428OooOoOO, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(C20857Oooooo.OooO0O0(this.f69426OooOoO, 24), C20857Oooooo.OooO0O0(this.f69426OooOoO, 24));
        layoutParams3.gravity = 16;
        layoutParams3.setMargins(C20857Oooooo.OooO0O0(this.f69426OooOoO, 4), 0, 0, 0);
        addView(this.f69430OooOoo0, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C20857Oooooo.OooO0O0(this.f69426OooOoO, 24), C20857Oooooo.OooO0O0(this.f69426OooOoO, 24));
        layoutParams4.gravity = 16;
        layoutParams4.setMargins(C20857Oooooo.OooO0O0(this.f69426OooOoO, 2), 0, 0, 0);
        addView(this.f69429OooOoo, layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(C20857Oooooo.OooO0O0(this.f69426OooOoO, 24), C20857Oooooo.OooO0O0(this.f69426OooOoO, 24));
        layoutParams5.gravity = 16;
        layoutParams5.setMargins(C20857Oooooo.OooO0O0(this.f69426OooOoO, 2), 0, 0, 0);
        addView(this.f69431OooOooO, layoutParams5);
        pDFView.addView(this, layoutParams);
        this.f69427OooOoO0 = pDFView;
    }

    @Override // o0O0oO0o.InterfaceC26102OooOOo
    public final void show() {
        setVisibility(0);
        OooO0o();
    }
}
