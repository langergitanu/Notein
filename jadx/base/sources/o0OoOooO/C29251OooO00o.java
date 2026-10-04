package o0OoOooO;

import OooOoO.C20504OooO0O0;
import Oooo0.o000000O;
import Oooo0o0.C21009OooOooO;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.AbstractC22050OooOo0o;
import androidx.recyclerview.widget.OooOOO;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22205OooOOo;
import com.facebook.drawee.view.SimpleDraweeView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o00ooO0o.C25763OooO00o;
import o00ooO0o.C25764OooO0O0;
import o0O0oooO.ViewOnClickListenerC26290Oooo0o0;
import o0OoO000.ViewOnClickListenerC28586o0000o0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoOooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29251OooO00o extends AbstractC22050OooOo0o<TiledPagePreviewVO, RecyclerView.AbstractC22078OooOooO> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f103739OooO0OO = o000000O.OooO0o(93);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ViewOnClickListenerC26290Oooo0o0 f103740OooO0O0;

    /* JADX INFO: renamed from: o0OoOooO.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C19976OooO00o extends RecyclerView.AbstractC22078OooOooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SimpleDraweeView f103741OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TextView f103742OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ImageView f103743OooO0OO;

        public C19976OooO00o(C29251OooO00o c29251OooO00o, View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.f57988tn);
            OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
            this.f103741OooO00o = (SimpleDraweeView) viewFindViewById;
            this.f103742OooO0O0 = (TextView) view.findViewById(R.id.page_number);
            this.f103743OooO0OO = (ImageView) view.findViewById(R.id.selected);
            view.setOnClickListener(new ViewOnClickListenerC28586o0000o0(c29251OooO00o, 1));
        }

        public final void OooO00o(TiledPagePreviewVO tiledPagePreviewVO, boolean z) {
            C25763OooO00o c25763OooO00oOooO00o;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            int index = tiledPagePreviewVO.getIndex();
            String url = tiledPagePreviewVO.getUrl();
            int width = tiledPagePreviewVO.getWidth();
            int height = tiledPagePreviewVO.getHeight();
            StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(index, "bind page ", ", url : ", url, ", (w,h) : ");
            C24472OooOoo.OooO0O0(sbOooO0OO, ", ", ", needRefresh: ", width, height);
            sbOooO0OO.append(z);
            c20358OooO00o.OooO00o(sbOooO0OO.toString(), new Object[0]);
            SimpleDraweeView simpleDraweeView = this.f103741OooO00o;
            simpleDraweeView.setTag(tiledPagePreviewVO);
            this.itemView.setTag(tiledPagePreviewVO);
            if (z) {
                String url2 = tiledPagePreviewVO.getUrl();
                if (url2.length() <= 0) {
                    url2 = null;
                }
                Uri uriFromFile = url2 != null ? Uri.fromFile(new File(url2)) : null;
                int width2 = tiledPagePreviewVO.getWidth();
                int height2 = tiledPagePreviewVO.getHeight();
                if (uriFromFile != null) {
                    C25764OooO0O0 c25764OooO0O0OooO0o = C25764OooO0O0.OooO0o(uriFromFile);
                    c25764OooO0O0OooO0o.OooO0O0();
                    c25764OooO0O0OooO0o.OooO0OO();
                    c25763OooO00oOooO00o = c25764OooO0O0OooO0o.OooO00o();
                } else {
                    C25764OooO0O0 c25764OooO0O0OooO0o0 = C25764OooO0O0.OooO0o0(R.color.white);
                    c25764OooO0O0OooO0o0.OooO0O0();
                    c25764OooO0O0OooO0o0.OooO0OO();
                    c25763OooO00oOooO00o = c25764OooO0O0OooO0o0.OooO00o();
                }
                ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
                layoutParams.width = Math.max(C29251OooO00o.f103739OooO0OO, width2);
                layoutParams.height = height2;
                simpleDraweeView.requestLayout();
                simpleDraweeView.setImageRequest(c25763OooO00oOooO00o);
            }
            ImageView selected = this.f103743OooO0OO;
            OooOOO0.OooO0o(selected, "selected");
            selected.setVisibility(8);
            this.f103742OooO0O0.setText(String.valueOf(tiledPagePreviewVO.getIndex() + 1));
            if (!tiledPagePreviewVO.getHighlight()) {
                this.itemView.setBackground(null);
            } else {
                View view = this.itemView;
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.item_bg_color_pressed));
            }
        }
    }

    /* JADX INFO: renamed from: o0OoOooO.OooO00o$OooO0O0 */
    public static final class OooO0O0 extends OooOOO.AbstractC22036OooO0o0<TiledPagePreviewVO> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0 f103744OooO00o = new OooO0O0();

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO00o(TiledPagePreviewVO tiledPagePreviewVO, TiledPagePreviewVO tiledPagePreviewVO2) {
            return tiledPagePreviewVO.equals(tiledPagePreviewVO2);
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final boolean OooO0O0(TiledPagePreviewVO tiledPagePreviewVO, TiledPagePreviewVO tiledPagePreviewVO2) {
            TiledPagePreviewVO tiledPagePreviewVO3 = tiledPagePreviewVO;
            TiledPagePreviewVO tiledPagePreviewVO4 = tiledPagePreviewVO2;
            return OooOOO0.OooO0O0(tiledPagePreviewVO3.getId(), tiledPagePreviewVO4.getId()) && tiledPagePreviewVO3.getOrientation() == tiledPagePreviewVO4.getOrientation();
        }

        @Override // androidx.recyclerview.widget.OooOOO.AbstractC22036OooO0o0
        public final Object OooO0OO(TiledPagePreviewVO tiledPagePreviewVO, TiledPagePreviewVO tiledPagePreviewVO2) {
            TiledPagePreviewVO tiledPagePreviewVO3 = tiledPagePreviewVO;
            TiledPagePreviewVO tiledPagePreviewVO4 = tiledPagePreviewVO2;
            if (OooOOO0.OooO0O0(tiledPagePreviewVO3.getId(), tiledPagePreviewVO4.getId()) && tiledPagePreviewVO3.getIndex() == tiledPagePreviewVO4.getIndex()) {
                return (OooOOO0.OooO0O0(tiledPagePreviewVO3.getUrl(), tiledPagePreviewVO4.getUrl()) && tiledPagePreviewVO3.getTimestamp() == tiledPagePreviewVO4.getTimestamp()) ? tiledPagePreviewVO3.getSelectable() != tiledPagePreviewVO4.getSelectable() ? C22205OooOOo.OooO0O0("needRefresh", false) : C22205OooOOo.OooO0O0("needRefresh", false) : C22205OooOOo.OooO0O0("needRefresh", true);
            }
            return C22205OooOOo.OooO0O0("needRefresh", true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i) {
        OooOOO0.OooO0oO(holder, "holder");
        TiledPagePreviewVO tiledPagePreviewVOOooO0OO = OooO0OO(i);
        OooOOO0.OooO0o(tiledPagePreviewVOOooO0OO, "getItem(...)");
        ((C19976OooO00o) holder).OooO00o(tiledPagePreviewVOOooO0OO, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final RecyclerView.AbstractC22078OooOooO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewOooO0OO = C20504OooO0O0.OooO0OO(viewGroup, "parent", R.layout.item_page_tile_tn, viewGroup, false);
        OooOOO0.OooO0Oo(viewOooO0OO);
        return new C19976OooO00o(this, viewOooO0OO);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC22062OooO0oO
    public final void onBindViewHolder(RecyclerView.AbstractC22078OooOooO holder, int i, List<Object> payloads) {
        OooOOO0.OooO0oO(holder, "holder");
        OooOOO0.OooO0oO(payloads, "payloads");
        if (!payloads.isEmpty()) {
            Object obj = payloads.get(0);
            OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type android.os.Bundle");
            if (!((Bundle) obj).getBoolean("needRefresh")) {
                TiledPagePreviewVO tiledPagePreviewVOOooO0OO = OooO0OO(i);
                OooOOO0.OooO0o(tiledPagePreviewVOOooO0OO, "getItem(...)");
                ((C19976OooO00o) holder).OooO00o(tiledPagePreviewVOOooO0OO, false);
                return;
            }
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
