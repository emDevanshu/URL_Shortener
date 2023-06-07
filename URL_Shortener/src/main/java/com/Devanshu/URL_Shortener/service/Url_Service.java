package com.Devanshu.URL_Shortener.service;

import com.Devanshu.URL_Shortener.model.Url;
import com.Devanshu.URL_Shortener.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface Url_Service {
    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public  void  deleteShortLink(Url url);
}
