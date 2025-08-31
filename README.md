# 📖 성경 말씀 API

성경 말씀 API는 아래와 같은 기능을 제공하는 API입니다.

+ 랜덤으로 성경 말씀 불러오기

## 🌐 API 주소
```
GET bible-verse-api.up.railway.app/api/verse
```

## 📊 응답 형식
```json
{
  "book": "요한복음",
  "chapter": "3", 
  "verse": "16",
  "text": "하나님이 세상을 이처럼 사랑하사 독생자를 주셨으니...",
  "reference": "요한복음 3:16"
}
```

## 📱 사용 예시

### curl로 테스트

```bash
curl bible-verse-api.up.railway.app/api/verse
```

### JavaScript

```javascript
fetch('https://bible-verse-api.up.railway.app/api/verse')
  .then(response => response.json())
  .then(data => {
    console.log(`${data.reference}: ${data.text}`);
  });
```

### Java
```java
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://bible-verse-api.vercel.app/api/verse"))
    .build();

HttpResponse<String> response = client.send(request, 
    HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
```

## 🤝 기여하기
새로운 성경 구절을 추가하고 싶으시면:
1. 이 리포지토리를 Fork
2. `src/main/resources/verses.json` 파일의 `{"book":"","chapter":"","verse":"","text":""}` 형태로 성경말씀을 추가:
   ```json
   {"book":"책(서)","chapter":"장(章)","verse":"절(節)","text":"본문/말씀"}
   ```
3. Pull Request 보내기

## 📈 현재 포함된 성경 구절
- 총 30개의 성경 구절 수록
- 신구약 성경 주요 구절들
- 희망, 사랑, 믿음, 위로 등 다양한 주제

## 📄 라이선스

+ 저장소: 사용자 정의 라이선스 (비상업·수정 금지) v1.1 <br>
  © 2025 Su Ho Choi. All rights reserved. <br>
  자세한 내용은 LICENSE 참조.


## 📚 데이터 고지

성경 텍스트 데이터는 번역본 저작권이 있을 수 있습니다.

## 📬 문의

이메일: csw020106@naver.com

이슈: 버그/제안은 GitHub Issues로 등록해 주세요.

Made with ❤️ for everyone who needs God's word