package com.orion.notein.p607ui.creative_library;

import OooOoO.C20504OooO0O0;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.OooO0OO;
import com.github.chrisbanes.photoview.PhotoView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0oOo.C28366o000000o;
import o0Oo0oOo.o000000;
import o0Oo0oOo.o000000O;
import o0Oo0oOo.o000OOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/ImagePreviewDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ImagePreviewDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView f70965OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ViewPager2 f70966OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f70967OooOoO = C34434OooOoO.f123453OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public TextView f70968OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f70969OooOoOO;

    public static final class OooO00o extends RecyclerView.AbstractC22062OooO0oO<C19170OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f70970OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000000 f70971OooO0O0;

        /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.ImagePreviewDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19170OooO00o extends RecyclerView.AbstractC22078OooOooO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final PhotoView f70972OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final ProgressBar f70973OooO0O0;

            public C19170OooO00o(View view) {
                super(view);
                View viewFindViewById = view.findViewById(R.id.photo_view);
                OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
                this.f70972OooO00o = (PhotoView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(R.id.progress_bar);
                OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
                this.f70973OooO0O0 = (ProgressBar) viewFindViewById2;
            }
        }

        public OooO00o(List imageUrls, o000000 o000000Var) {
            OooOOO0.OooO0oO(imageUrls, "imageUrls");
            this.f70970OooO00o = imageUrls;
            this.f70971OooO0O0 = o000000Var;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
        public final int getItemCount() {
            return this.f70970OooO00o.size();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
        public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i) {
            C19170OooO00o holder = (C19170OooO00o) abstractC22078OooOooO;
            OooOOO0.OooO0oO(holder, "holder");
            String imageUrl = (String) this.f70970OooO00o.get(i);
            OooOOO0.OooO0oO(imageUrl, "imageUrl");
            o000000 onSingleTap = this.f70971OooO0O0;
            OooOOO0.OooO0oO(onSingleTap, "onSingleTap");
            holder.f70973OooO0O0.setVisibility(0);
            o000000O o000000o2 = new o000000O(onSingleTap, 0);
            PhotoView photoView = holder.f70972OooO00o;
            photoView.setOnClickListener(o000000o2);
            OooO0OO.OooO0Oo(holder.itemView.getContext()).OooOO0O(imageUrl).OoooO(new C23057Oooo0o(holder)).OoooO0(photoView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
        public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
            View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_image_preview, viewGroup, false);
            OooOOO0.OooO0Oo(viewOooO0OO);
            return new C19170OooO00o(viewOooO0OO);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void OooOoO(int i) {
        TextView textView = this.f70968OooOoO0;
        if (textView == null) {
            OooOOO0.OooOOOO("tvPageIndicator");
            throw null;
        }
        textView.setText((i + 1) + " / " + this.f70967OooOoO.size());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, android.R.style.Theme.Black.NoTitleBar.Fullscreen);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Object stringArrayList = arguments.getStringArrayList("image_urls");
            if (stringArrayList == null) {
                stringArrayList = C34434OooOoO.f123453OooOo0o;
            }
            this.f70967OooOoO = stringArrayList;
            this.f70969OooOoOO = arguments.getInt("start_position", 0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        OooOOO0.OooO0o(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(ViewCompat.MEASURED_STATE_MASK);
            window.setNavigationBarColor(ViewCompat.MEASURED_STATE_MASK);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.dialog_image_preview, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.List] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f70966OooOo0o = (ViewPager2) view.findViewById(R.id.view_pager);
        this.f70965OooOo = (ImageView) view.findViewById(R.id.btn_close);
        this.f70968OooOoO0 = (TextView) view.findViewById(R.id.tv_page_indicator);
        OooO00o oooO00o = new OooO00o(this.f70967OooOoO, new o000000(this));
        ViewPager2 viewPager2 = this.f70966OooOo0o;
        if (viewPager2 == null) {
            OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        viewPager2.setAdapter(oooO00o);
        ViewPager2 viewPager22 = this.f70966OooOo0o;
        if (viewPager22 == null) {
            OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        viewPager22.OooO0OO(this.f70969OooOoOO, false);
        ViewPager2 viewPager23 = this.f70966OooOo0o;
        if (viewPager23 == null) {
            OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        viewPager23.OooO00o(new C28366o000000o(this));
        TextView textView = this.f70968OooOoO0;
        if (textView == null) {
            OooOOO0.OooOOOO("tvPageIndicator");
            throw null;
        }
        textView.setVisibility(this.f70967OooOoO.size() <= 1 ? 8 : 0);
        ImageView imageView = this.f70965OooOo;
        if (imageView == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        imageView.setOnClickListener(new o000OOo(this, 0));
        OooOoO(this.f70969OooOoOO);
    }
}
