package com.nimbusds.jose.jwk.source;

import Oooo0oO.C21111o0ooOoO;
import com.nimbusds.jose.RemoteKeySourceException;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKMatcher;
import com.nimbusds.jose.jwk.JWKSelector;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.util.DefaultResourceRetriever;
import com.nimbusds.jose.util.ResourceRetriever;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class RemoteJWKSet<C extends SecurityContext> implements JWKSource<C> {
    public static final int DEFAULT_HTTP_CONNECT_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_READ_TIMEOUT = 500;
    public static final int DEFAULT_HTTP_SIZE_LIMIT = 51200;
    private final JWKSetCache jwkSetCache;
    private final ResourceRetriever jwkSetRetriever;
    private final URL jwkSetURL;

    public RemoteJWKSet(URL url) {
        this(url, null);
    }

    public static String getFirstSpecifiedKeyID(JWKMatcher jWKMatcher) {
        Set<String> keyIDs = jWKMatcher.getKeyIDs();
        if (keyIDs != null && !keyIDs.isEmpty()) {
            for (String str : keyIDs) {
                if (str != null) {
                    return str;
                }
            }
        }
        return null;
    }

    private JWKSet updateJWKSetFromURL() throws RemoteKeySourceException {
        try {
            try {
                JWKSet jWKSet = JWKSet.parse(this.jwkSetRetriever.retrieveResource(this.jwkSetURL).getContent());
                this.jwkSetCache.put(jWKSet);
                return jWKSet;
            } catch (ParseException e) {
                throw new RemoteKeySourceException("Couldn't parse remote JWK set: " + e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new RemoteKeySourceException(C21111o0ooOoO.OooO00o(e2, new StringBuilder("Couldn't retrieve remote JWK set: ")), e2);
        }
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSource
    public List<JWK> get(JWKSelector jWKSelector, C c) throws Exception {
        JWKSet jWKSetUpdateJWKSetFromURL;
        JWKSet jWKSetUpdateJWKSetFromURL2 = this.jwkSetCache.get();
        if (this.jwkSetCache.requiresRefresh() || jWKSetUpdateJWKSetFromURL2 == null) {
            try {
                jWKSetUpdateJWKSetFromURL2 = updateJWKSetFromURL();
            } catch (Exception e) {
                if (jWKSetUpdateJWKSetFromURL2 == null) {
                    throw e;
                }
            }
        }
        List<JWK> listSelect = jWKSelector.select(jWKSetUpdateJWKSetFromURL2);
        if (!listSelect.isEmpty()) {
            return listSelect;
        }
        String firstSpecifiedKeyID = getFirstSpecifiedKeyID(jWKSelector.getMatcher());
        if (firstSpecifiedKeyID != null && jWKSetUpdateJWKSetFromURL2.getKeyByKeyId(firstSpecifiedKeyID) == null && (jWKSetUpdateJWKSetFromURL = updateJWKSetFromURL()) != null) {
            return jWKSelector.select(jWKSetUpdateJWKSetFromURL);
        }
        return Collections.EMPTY_LIST;
    }

    public JWKSet getCachedJWKSet() {
        return this.jwkSetCache.get();
    }

    public JWKSetCache getJWKSetCache() {
        return this.jwkSetCache;
    }

    public URL getJWKSetURL() {
        return this.jwkSetURL;
    }

    public ResourceRetriever getResourceRetriever() {
        return this.jwkSetRetriever;
    }

    public RemoteJWKSet(URL url, ResourceRetriever resourceRetriever) {
        this(url, resourceRetriever, null);
    }

    public RemoteJWKSet(URL url, ResourceRetriever resourceRetriever, JWKSetCache jWKSetCache) {
        if (url != null) {
            this.jwkSetURL = url;
            if (resourceRetriever != null) {
                this.jwkSetRetriever = resourceRetriever;
            } else {
                this.jwkSetRetriever = new DefaultResourceRetriever(500, 500, DEFAULT_HTTP_SIZE_LIMIT);
            }
            if (jWKSetCache != null) {
                this.jwkSetCache = jWKSetCache;
                return;
            } else {
                this.jwkSetCache = new DefaultJWKSetCache();
                return;
            }
        }
        throw new IllegalArgumentException("The JWK set URL must not be null");
    }
}
