package com.microsoft.identity.common.java.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oO0000Oo.OooO0O0;
import oO0000o0.OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class CommonURIBuilder extends OooO00o {
    public CommonURIBuilder() {
    }

    private boolean containsParam(String str) {
        if (str == null) {
            throw new NullPointerException("param is marked non-null but is null");
        }
        Iterator<OooO0O0> it = getQueryParams().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public CommonURIBuilder addParameterIfAbsent(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("param is marked non-null but is null");
        }
        if (str2 == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        if (containsParam(str)) {
            return this;
        }
        super.addParameter(str, str2);
        return this;
    }

    @Override // oO0000o0.OooO00o
    public /* bridge */ /* synthetic */ OooO00o addParameters(List list) {
        return addParameters((List<OooO0O0>) list);
    }

    public CommonURIBuilder addParametersIfAbsent(Map<String, ?> map) {
        if (map != null) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                addParameterIfAbsent(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    public String getLastPathSegment() {
        return getPathSegments().isEmpty() ? "" : (String) System.currentTimeMillis();
    }

    @Override // oO0000o0.OooO00o
    public /* bridge */ /* synthetic */ OooO00o setParameters(List list) {
        return setParameters((List<OooO0O0>) list);
    }

    public CommonURIBuilder(String str) throws URISyntaxException {
        super(str);
    }

    @Override // oO0000o0.OooO00o
    public CommonURIBuilder addParameter(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("param is marked non-null but is null");
        }
        if (str2 == null) {
            throw new NullPointerException("value is marked non-null but is null");
        }
        throw new UnsupportedOperationException("This should never be used. Either use setParameter or addParametersIfAbsent");
    }

    @Override // oO0000o0.OooO00o
    public CommonURIBuilder addParameters(List<OooO0O0> list) {
        if (list == null) {
            throw new NullPointerException("nvps is marked non-null but is null");
        }
        throw new UnsupportedOperationException("This should never be used. Either use setParameter or addParametersIfAbsent");
    }

    @Override // oO0000o0.OooO00o
    public CommonURIBuilder setParameter(String str, String str2) {
        super.setParameter(str, str2);
        return this;
    }

    public CommonURIBuilder(URI uri) {
        super(uri);
    }

    public CommonURIBuilder addParametersIfAbsent(List<Map.Entry<String, String>> list) {
        if (list != null) {
            for (Map.Entry<String, String> entry : list) {
                addParameterIfAbsent(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    @Override // oO0000o0.OooO00o
    public CommonURIBuilder setParameters(List<OooO0O0> list) {
        super.setParameters(list);
        return this;
    }

    @Override // oO0000o0.OooO00o
    public CommonURIBuilder setParameters(OooO0O0... oooO0O0Arr) {
        super.setParameters(oooO0O0Arr);
        return this;
    }
}
