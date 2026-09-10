# 经营披露一致性核验

核验器接收带来源和口径的经营指标快照，生成可追溯的差异说明。规则样例在 `contracts`，持久化配置通过环境变量传入。

运行 `docker compose up --build` 后，用 `curl http://localhost:8080/health` 检查服务。
