# 📈 Quick — Calculadora de Rendimento CDI

Aplicativo Android desenvolvido para calcular o rendimento de investimentos com base na **taxa CDI**, utilizando juros **simples** e **compostos**. Com sistema de cadastro e login, o usuário acessa a calculadora de forma personalizada.

---

## 📱 Telas do Aplicativo

| Tela | Descrição |
|------|-----------|
| **Home** | Tela inicial com logo e botões para Entrar ou Cadastrar |
| **Cadastro** | Formulário com nome de usuário, e-mail e senha |
| **Login** | Autenticação com e-mail e senha |
| **Calculadora** | Cálculo do rendimento por juros simples ou compostos com base no CDI |

---

## 🔄 Fluxo de Navegação

```
Home → Cadastro → Login → Calculadora
Home → Login → Calculadora
```

---

## 🚀 Tecnologias Utilizadas

- **Java** — linguagem principal do desenvolvimento
- **Android Studio** — IDE de desenvolvimento
- **XML** — layouts e interface das telas
- **Gradle (Kotlin DSL)** — gerenciamento de build e dependências
- **Android SDK** — APIs nativas do Android

---

## ✨ Funcionalidades

- ✅ Tela inicial com navegação para login e cadastro
- ✅ Cadastro de usuário com nome, e-mail e senha
- ✅ Validação de campos em todas as telas (campos obrigatórios)
- ✅ Login com e-mail e senha
- ✅ Calculadora com entrada de capital, taxa de juros e período em meses
- ✅ Seleção do tipo de juros via Spinner (Simples ou Compostos)
- ✅ Ícones de informação (ℹ️) com Toast explicativo em cada campo
- ✅ Exibição do montante final formatado em R$
- ✅ Navegação entre telas com `Intent`

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

> Onde: `C` = Capital inicial | `i` = Taxa de juros (CDI) | `t` = Período em meses | `M` = Montante final

---

## 📁 Estrutura do Projeto

```
Quick/
│
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/telaprincipal/
│   │       │   ├── homeActivity.java       → Tela inicial
│   │       │   ├── cadastroActivity.java   → Tela de cadastro
│   │       │   ├── loginActivity.java      → Tela de login
│   │       │   └── MainActivity.java       → Calculadora CDI
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   ├── activity_home.xml
│   │       │   │   ├── activity_cadastro.xml
│   │       │   │   ├── activity_login.xml
│   │       │   │   └── activity_main.xml
│   │       │   └── drawable/
│   │       │       ├── logo.png
│   │       │       ├── quick_logo.png
│   │       │       ├── login.png
│   │       │       └── edittextlayout.xml
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
Projeto desenvolvido como segundo projeto mobile, aplicando conceitos de Java para Android, navegação entre Activities, validação de formulários e lógica financeira com juros simples e compostos.

---

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais e de portfólio.
