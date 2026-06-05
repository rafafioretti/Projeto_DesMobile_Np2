# Projeto_DesMobile_Np2
Calculadora de rendimento CDI para Android — juros simples e compostos, desenvolvido em Java.
# 📈 Quick — Calculadora de Rendimento CDI

Aplicativo Android desenvolvido para calcular o rendimento de investimentos com base na **taxa CDI**, utilizando juros **simples** e **compostos**. Ideal para simular quanto seu dinheiro pode render de forma rápida e prática.

---

## 📱 Telas do Aplicativo

| Tela | Descrição |
|------|-----------|
| **Tela Inicial** | Entrada do valor investido, período e percentual do CDI |
| **Tela de Resultado** | Exibe o rendimento calculado em juros simples e compostos |

---

## 🚀 Tecnologias Utilizadas

- **Java** — linguagem principal do desenvolvimento
- **Android Studio** — IDE de desenvolvimento
- **XML** — layouts e interface das telas
- **Gradle (Kotlin DSL)** — gerenciamento de build e dependências
- **Android SDK** — APIs nativas do Android

---

## 💡 Funcionalidades

- ✅ Cálculo de rendimento por **juros simples**
- ✅ Cálculo de rendimento por **juros compostos**
- ✅ Baseado na taxa **CDI** (Certificado de Depósito Interbancário)
- ✅ Tela de resultado com comparativo dos dois tipos de rendimento
- ✅ Interface limpa e intuitiva

---

## 📐 Fórmulas Utilizadas

**Juros Simples:**
```
M = C × (1 + i × t)
```

**Juros Compostos:**
```
M = C × (1 + i)^t
```

> Onde: `C` = Capital inicial | `i` = Taxa de juros (CDI) | `t` = Período | `M` = Montante final

---

## 📁 Estrutura do Projeto

```
Quick/
│
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/         → Lógica em Java (Activities)
│   │       ├── res/
│   │       │   ├── layout/   → Telas em XML
│   │       │   └── values/   → Cores, strings, temas
│   │       └── AndroidManifest.xml
│   └── build.gradle.kts
│
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```

---

## ▶️ Como Rodar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/rafafioretti/quick.git
```

2. Abra no **Android Studio**
3. Aguarde a sincronização do Gradle
4. Conecte um dispositivo ou inicie um emulador Android
5. Clique em **Run ▶️**

> Requisito mínimo: Android 7.0 (API 24) ou superior

---

## 👨‍💻 Desenvolvido por

**Rafael Fioretti**  
Projeto desenvolvido como segundo projeto mobile, aplicando conceitos de Java para Android, lógica financeira e navegação entre telas.

---

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais e de portfólio.
